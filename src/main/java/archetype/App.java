package archetype;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.function.Supplier;

public class App {
    private static final Random RANDOM = new Random();

    public Integer max() {
        int[][] arr = new int[5][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = RANDOM.nextInt(20);
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        int[] result = new int[arr.length];
        final CountDownLatch executionCompleted = new CountDownLatch(arr.length);
        for (int i = 0; i < arr.length; i++) {
            new Worker(arr, i, result, executionCompleted).start();
        }
        try {
            executionCompleted.await();
            System.out.println("All over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Arrays.toString(result));
        int res = result[0];
        for (int i = 1; i < arr.length; i++) {
            if (result[i] > res) {
                res = result[i];
            }
        }
        System.out.println(res);
        return res;
    }
}

class Worker extends Thread {
    private final int[][] arr;
    private final int raw;
    private final int[] result;
    private final CountDownLatch executionCompleted;

    public Worker(int[][] arr, int raw, int[] result, CountDownLatch executionCompleted) {
        this.arr = arr;
        this.raw = raw;
        this.result = result;
        this.executionCompleted = executionCompleted;
    }

    @Override
    public void run() {
        int res = arr[raw][0];
        for (int i = 1; i < arr[0].length; i++) {
            if (arr[raw][i] > res) {
                res = arr[raw][i];
            }
        }
        result[raw] = res;
        executionCompleted.countDown();
    }
}

class AppTest{

    public static void main(String[] args) {
        benchmark(() -> new App().max(), "Max value in Matrix");
    }

    private static void benchmark(Supplier<Integer> aggregator, String title) {
        int repetitions = 20;

        long start = System.nanoTime();
        for (int i = 0; i < repetitions; i++) {
            aggregator.get();
        }
        long end = System.nanoTime();

        double avgDuration = ((end - start) / (repetitions * 1_000_000_000d));
        System.out.println(title + " method duration = " + avgDuration);
    }
}
