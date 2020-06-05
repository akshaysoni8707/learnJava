package Chapter6;
class shutdownThread extends Thread{
    public void run(){
        System.out.println("All task completed. I am shutdown hook . Bye...");
    }
}
public class ShutdownHookDemo {
    public static void main(String[] args) {
        shutdownThread st = new shutdownThread();
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(st);

        for (int i = 0; i < 10; i++) {
            System.out.println("Line no " + i);
        }

        System.out.println("Program is shutting down.... If you cant wait press ctrl + c or stop");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
