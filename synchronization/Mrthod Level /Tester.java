class Tester{
    public synchronized void display(String message) throws InterruptedException{
        System.out.println(message+" i am display 1 by "+Thread.currentThread().getName());
        Thread.sleep(3000);
    }       
    public synchronized void display2(String message) throws InterruptedException{
        System.out.println(message+" i am display2 by "+Thread.currentThread().getName());
        Thread.sleep(3000);
    }
}
