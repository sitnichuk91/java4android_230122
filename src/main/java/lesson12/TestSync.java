package lesson12;

public class TestSync {
    private static final int STEPS = 10000;
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        TestSync testSync = new TestSync();

        var t1 = new Thread(testSync::incCounter); // var t1 = new Thread(() -> testSync.incCounter());
        var t2 = new Thread(testSync::decCounter); // var t2 = new Thread(() -> testSync.decCounter());

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter);
    }

    public synchronized void incCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter++;
        }
    }

    public synchronized void decCounter() {
        for (int i = 0; i < STEPS; i++) {
            counter--;
        }
    }
}
