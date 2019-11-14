import java.util.concurrent.CyclicBarrier;

public class Main {
    public static void main(String[] args) {
        final CyclicBarrier gate = new CyclicBarrier(3);

        Thread firstThread = new Thread() {
            public void run() {
                try {
                    gate.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hey, this is thread number ONE printing:" + ThreadSafeCounter.nextInteger());
                }
            }
        };


        Thread secondThread = new Thread() {
            public void run() {
                try {
                    gate.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1000; i++) {
                    System.out.println("Hey, this is thread number TWO printing:" + ThreadSafeCounter.nextInteger());
                }
            }
        };

        firstThread.start();
        secondThread.start();

        try {
            gate.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
