class Temp extends Thread {
    Temp x;
    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("MyGroup");
        System.out.println("Thread Group Name: " + group.getParent().getName());
        ThreadGroup subGroup = new ThreadGroup(group, "SubGroup");
        System.out.println("Sub Thread Group Name: " + subGroup.getName());
        subGroup.setMaxPriority(8);
        Thread thread1 = new Thread(subGroup, "Thread1");
        System.out.println("Thread1 Priority: " + thread1.getPriority());
        System.out.println(subGroup.activeCount());
        subGroup.list();
    }


}