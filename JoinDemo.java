// Demonstrate isAlive() and join()

class NewThread implements Runnable {

    String name;
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t = new Thread(this, name);
        System.out.println("New thread: " + t);
        t.start(); // Start the thread
    }

    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " Interrupted.");
        }
        System.out.println(name + " exiting.");
    }
}

class JoinDemo {

    public static void main(String args[]) {

        NewThread ob1 = new NewThread("One");

        System.out.println("Thread One is alive: " + ob1.t.isAlive());

        try {
            System.out.println("Waiting for thread to finish.");
            ob1.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread Interrupted");
        }

        System.out.println("Thread One is alive: " + ob1.t.isAlive());
        System.out.println("Main thread exiting.");
    }
}