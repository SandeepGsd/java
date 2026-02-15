package interrupt;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();
        thread1.interrupt();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                System.out.println("Child Thread: " + i);
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println("Thread was interrupted, stopping...");
                break;
            }
        }
    }
}
