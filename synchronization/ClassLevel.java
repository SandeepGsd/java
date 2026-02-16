//class level lock
class MyThread extends Thread {
    DisplayMessage displayMessage ;
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
    public synchronized static void display(String message){
        System.out.print("[" + message);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            System.getLogger(MyThread.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        
    }
}

public class ClassLevel{
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Hello");
        MyThread thread2 = new MyThread("World");
        thread1.setPriority(Thread.MIN_PRIORITY);  
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        thread2.start();
    }
}