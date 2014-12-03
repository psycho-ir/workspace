import java.util.Random;
import java.util.concurrent.*;

/**
 * Created by soroosh on 11/24/14.
 */
public class PoolProgram {
    public static void main(String... args) throws InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.put(() -> {
                Random random = new Random();
                int waitingTime = random.nextInt(10);
                System.out.println(String.format("Waiting for %s seconds", waitingTime));
                try {
                    Thread.sleep(waitingTime * 1000l);
                    System.out.println(String.format("Thread %s released.", Thread.currentThread().getName()));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            });
        }

        CountDownLatch latch = new CountDownLatch(5);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(10, 100, 1000, TimeUnit.SECONDS, queue);
        executor.prestartAllCoreThreads();
        executor.shutdown();

    }
}
