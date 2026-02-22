//class level lock
class MyThread extends Thread {
    String message;
    public MyThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        DisplayMessage.display(message);
}
}

class DisplayMessage{
    public static void display(String message){
        System.out.println("[" + message);
        synchronized(new Object()/*random object*/)
        {
            System.out.println(" i am display by " + Thread.currentThread().getName() + "]");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.getLogger(MyThread.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
    }
}

public class BlockLevel{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Hello");
        MyThread thread2 = new MyThread("World");
        MyThread thread3 = new MyThread("Java");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}