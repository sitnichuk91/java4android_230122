package lesson13;

import java.util.concurrent.*;

public class CallableTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] arr2 = {9, 1, 2, 3, 4, 2, 1, 2, 2};

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        ExecutorService executorService2 = Executors.newSingleThreadExecutor();

        System.out.println("Checkpoint 1");

        Callable callable = new Callable() {
            @Override
            public Object call() throws Exception {
                int resultSum = 0;
                for (int i : arr1) {
                    resultSum += i;
                    System.out.println("t1 " + i);
                }
                return resultSum;
            }
        };

        Future<Integer> f1 = executorService.submit(callable);
        System.out.println("Checkpoint 2");

        Future<?> f2 = executorService2.submit(() -> {
            int resultSum = 0;
            for (int i : arr2) {
                resultSum += i;
                System.out.println("t2 " + i);
            }
            return resultSum;
        });
        System.out.println("Checkpoint 3");

        System.out.println("Суммы потоков: " + f1.get() + " and " + f2.get());
    }
}
