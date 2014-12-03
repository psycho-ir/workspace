import java.beans.XMLEncoder;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by soroosh on 11/23/14.
 */
public class ObjectWriter {
    private static void initializeSystemClass() {
        System.out.println("Nooooooooooo");
    }
    public static void main(String... args) throws IOException {

        ConcurrentHashMap m = new ConcurrentHashMap();
        ReentrantLock l = new ReentrantLock();

        Thread.setDefaultUncaughtExceptionHandler((Thread t, Throwable e) -> System.out.println(String.format("Wow Exception: %s in Thread: %s", e, t)));
//        throw new RuntimeException("Hoora");

        try (Test t = new Test()) {
            t.setLastName("sss");
            System.out.println(t);
        }


//        Test t = new Test("so", "sa");
//        try (FileOutputStream fos = new FileOutputStream("s.xml"); XMLEncoder encoder = new XMLEncoder(fos)) {
//            encoder.setExceptionListener((Exception e) -> System.out.println("Exception! :" + e.toString()));
//            encoder.writeObject(t);
//        }

    }
}
