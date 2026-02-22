public class Main implements Runnable{
    static Method1 method1;
    static Method2 method2;
     @Override
     public void run() {
            if(Thread.currentThread().getName().equals("Thread-1")){

                    method1.fun1(method2);
            }
                    
            else {
                
                    method2.fun1(method1);
                } 
            }
        
         
    public static void main(String[] args) {
        method1 = new Method1();
        method2 = new Method2();
        Main thread1 = new Main();
        Main thread2 = new Main();
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.setName("Thread-1");
        t2.setName("Thread-2");
        t1.start();
        t2.start();
        
}

}
