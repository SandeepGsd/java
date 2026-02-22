public class Main{
    public static void main(String[] args) {
        Tester displayMessage = new Tester();
        Tester displayMessage2 = new Tester();
        Thread1 thread1 = new Thread1(displayMessage, "Hello");
        Thread2 thread2 = new Thread2(displayMessage, "World");
        Thread1 thread3 = new Thread1(displayMessage2, "Java");
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");
        thread3.setName("Thread-3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}