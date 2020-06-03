package Chapter6;

class DummyParent {

}

class YourTask extends DummyParent implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("line no " + i + " in YourTask");
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

//        Runnable r = new YourTask();
//        Thread t = new Thread(r);
//        t.start();

//        Thread t = new Thread(new YourTask());
//        t.start();

        new Thread(new YourTask()).start();

        //This is my main thread
        for (int i = 1; i <= 100; i++) {
            System.out.println("line no " + i + " in main");
        }
    }
}
