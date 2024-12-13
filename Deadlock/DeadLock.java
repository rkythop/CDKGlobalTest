public class DeadLock {

    // Two resources shared between threads
    private static final Object r1 = new Object();
    private static final Object r2 = new Object();

    public static void main(String[] args) {
        // t1 locks r1 and tries to lock r2
        Thread t1 = new Thread(() -> {
            synchronized (r1) {
                System.out.println("T1: Locked r1");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("T1: Trying to lock r2");
                synchronized (r2) {
                    System.out.println("T1: Locked r2");
                }
            }
        });

        // T2 locks r2 and tries to lock r1
        Thread t2 = new Thread(() -> {
            synchronized (r2) {
                System.out.println("T2: Locked r2");

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }

                System.out.println("T2: Trying to lock r1");
                synchronized (r1) {
                    System.out.println("T2: Locked r1");
                }
            }
        });

        // Start both threads
        t1.start();
        t2.start();
    }
}