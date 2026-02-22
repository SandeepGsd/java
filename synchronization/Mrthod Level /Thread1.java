class Thread1 extends Thread{
    Tester displayMessage;
    String message;
    public Thread1(Tester displayMessage, String message) {
        this.displayMessage = displayMessage;
        this.message = message;
    }
    @Override
    public void run() {
        try {
            displayMessage.display(message);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
