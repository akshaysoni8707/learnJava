package Chapter6;

class Task1 extends Thread {
    //    void doTask() {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println("line no " + i + " in task1");
//        }
//    }
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("line no " + i + " in task1");
        }
    }
}

public class MyThread {
    public static void main(String[] args) {
        Task1 t = new Task1();
        t.start();
        //This is my main thread
        for (int i = 1; i <= 100; i++) {
            System.out.println("line no " + i + " in main");
        }
        //t.doTask();
    }
}

