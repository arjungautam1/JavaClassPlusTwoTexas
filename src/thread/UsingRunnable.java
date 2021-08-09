package thread;

public class UsingRunnable implements Runnable {
    public void run() {
        System.out.println("Thread is running..");
    }

    public static void main(String[] args) {
        UsingRunnable m1 = new UsingRunnable();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}
