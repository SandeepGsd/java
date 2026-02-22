//processor 1 to test executor framework

class Processor implements Runnable{
    String name;
    public Processor(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " is running in processor 1");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " is exiting from processor 1");
    }



}