class Thread2 extends Thread{
    Tester displayMessage;
    String message;
    public Thread2(Tester displayMessage, String message){
        this.displayMessage = displayMessage;
        this.message = message;
    }
    @Override
    public void run() {
        try {
            displayMessage.display2(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
