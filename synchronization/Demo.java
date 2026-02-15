package synchronization;
public class MyThread extends Thread {
    DisplayMessage displayMessage ;
    String message;
    public MyThread(DisplayMessage displayMessage, String message) {
        this.displayMessage = displayMessage;
        this.message = message;
    }

    public void run() {
        displayMessage.display(message);
    }
}

class DisplayMessage{
    public void display(String message){
        System.out.print("[" + message);
    }
}

class Demo{
    public static void main(String[] args) {
        DisplayMessage displayMessage = new DisplayMessage();
        MyThread thread1 = new MyThread(displayMessage, "Hello");    
        MyThread thread2 = new MyThread(displayMessage, "World");
        thread1.start();
        thread2.start();
    }
}