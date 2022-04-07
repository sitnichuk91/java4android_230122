package lesson13;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
//        testFixedExecutor();
//        testScheduledExecutorService();
//        testCollection();
    }

    private static void testFixedExecutor() {
        ExecutorService pool = Executors.newFixedThreadPool(3, r -> {
            System.out.println("Поток создан!");
            return new Thread(r);
        });
        for (int i = 0; i < 20; i++) {
            int k = i;
            pool.execute(() -> System.out.println(Thread.currentThread().getName() + " - " + k));
        }
        pool.shutdown();
    }

    private static void testCollection() {
        Map<String, String> oldMap = new Hashtable<>();
        Map<String, String> map = Collections.synchronizedMap(new HashMap<>());
        Map<String, String> chm = new ConcurrentHashMap<>();
    }

    private static void testScheduledExecutorService() {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        /*executorService.scheduleAtFixedRate(() -> {
            System.out.println(new Date() + " START");
            try {
                Thread.sleep(new Random().nextInt(3000) + 2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date() + " END");
        }, 0, 5000, TimeUnit.MILLISECONDS);*/
        executorService.scheduleWithFixedDelay(() -> {
            System.out.println(new Date() + " START");
            try {
                Thread.sleep(new Random().nextInt(3000) + 2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(new Date() + " END");
        }, 0, 5000, TimeUnit.MILLISECONDS);
    }
}
