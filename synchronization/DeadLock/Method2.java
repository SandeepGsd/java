class Method2{
    public synchronized void fun1(Method1 method){
        System.out.println("Method 1 is called by " + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        method.fun2();
    }

    public synchronized void fun2(){
        System.out.println("Method 2 is called by " + Thread.currentThread().getName());
    }
}