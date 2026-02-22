//processor 2 to test executor framework

class Processor2 implements Runnable{
    String name;
    public Processor2(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println(name + " is running in processor 2");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " is exiting from processor 2");
    }



}