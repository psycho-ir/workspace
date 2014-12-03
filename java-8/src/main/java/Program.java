import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by soroosh on 11/23/14.
 */
public class Program {
    public static void main(String... args) throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
        final String var1 = "soroosh";
        Runnable consumer = () -> System.out.println(var1);

        Object o = new Object();
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(5000l);
                synchronized (o) {
                    System.out.println("Notifying Object");
                    o.notify();
                    System.out.println("Object notified");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        t1.start();
        synchronized (o) {
            System.out.println("Waiting...");
            o.wait();
            System.out.println("Thank you. you rescued me.");
        }


    }


}
