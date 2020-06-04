package Chapter6;

class Printer {
    synchronized public void printDocs(int noOfFiles, String name) {
        for (int i = 1; i <= noOfFiles; i++) {
            System.out.println(name + " printed " + i + " file");
        }
    }
}

class User1 extends Thread {
    Printer pref;

    public User1(Printer pref, String name) {
        this.pref = pref;
        setName(name);
    }

    public void run() {
        pref.printDocs(10, this.getName());
    }
}

class User2 extends Thread {
    Printer pref;

    public User2(Printer pref, String name) {
        this.pref = pref;
        setName(name);
    }

    public void run() {
        pref.printDocs(10, this.getName());
    }
}

public class SynchronizationThread {
    public static void main(String[] args) {
        Printer pr = new Printer();
        //    pr.printDocs(10,"MAIN");
        User1 u1 = new User1(pr, "Akshay");
        User2 u2 = new User2(pr, "Sumit");
        u1.start();
//        try {
//            u1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        u2.start();
    }
}
