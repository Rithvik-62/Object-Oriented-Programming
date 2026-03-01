// Demonstrate interrupting a thread

class ChildThread extends Thread {

    public void run() {
        try {
            System.out.println("Child thread started.");
            Thread.sleep(1000);
            System.out.println("Child thread completed.");
        }
        catch (InterruptedException e) {
            System.out.println("InterruptedException caught in child thread!");
        }
    }
}

public class MainThread {

    public static void main(String[] args) throws InterruptedException {

        ChildThread childThread = new ChildThread();

        childThread.start();

        // Interrupt the child thread
        childThread.interrupt();

        System.out.println("Main thread finished.");
    }
}