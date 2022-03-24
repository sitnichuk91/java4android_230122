package lesson12;

public class TestNewThreads {
    public static void main(String[] args) {

        //=====Bad way to create threads=====//

        /*Thread t1 = new MyThread();
        Thread t2 = new MyThread();*/

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "A");
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "B");

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }, "C").start();

//        t1.setPriority(10);
//        t2.setPriority(1);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("THE END!!!!!!");
    }
}
