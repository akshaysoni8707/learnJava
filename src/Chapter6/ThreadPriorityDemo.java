package Chapter6;

class DummyThread extends Thread {

    public DummyThread(String name) {
        setName(name);
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(" Line " + i + " in thread " + getName());
        }
    }
}


public class ThreadPriorityDemo {
    public static void main(String[] args) {
        DummyThread d1 = new DummyThread("first");
        DummyThread d2 = new DummyThread("second");
        DummyThread d3 = new DummyThread("third");
        d1.setPriority(Thread.MAX_PRIORITY);
        d2.setPriority(Thread.NORM_PRIORITY);
        d3.setPriority(Thread.MIN_PRIORITY);

        d1.start();
        d2.start();
        d3.start();
    }
}
