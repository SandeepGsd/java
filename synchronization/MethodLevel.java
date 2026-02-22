package synchronization;

//method level lock
 class MyThread extends Thread {
    DisplayMessage displayMessage ;
    String message;
    public MyThread(DisplayMessage displayMessage, String message) {
        this.displayMessage = displayMessage;
        this.message = message;
    }

    public void run() {
        try {
            displayMessage.display(message);
        } catch (InterruptedException ex) {
            System.getLogger(MyThread.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }
}

class DisplayMessage{
    public synchronized void display(String message) throws InterruptedException{
        System.out.print("[" + message+"i am "+Thread.currentThread().getName());
        Thread.sleep(3000);

    public void display2(String message) throws InterruptedException{
        System.out.print("[" + message+"i am "+Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}

class MethodLevel{
    public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();
        DisplayMessage displayMessage2 = new DisplayMessage();
        MyThread thread1 = new MyThread(displayMessage, "Hello");
        MyThread thread2 = new MyThread(displayMessage, "World");
        MyThread thread3 = new MyThread(displayMessage2, "Java");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}