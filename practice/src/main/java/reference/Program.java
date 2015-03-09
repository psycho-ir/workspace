package reference;


import java.lang.ref.WeakReference;

/**
 * Created by soroosh on 1/14/15.
 */
public class Program {
    public static void main(String[] args) {
        WeakReference<String> v = new WeakReference<String>("soroosh dfueih duihf uihef hfh uigfh uirhe uighrueih uihgrh uihgrui huigh uirgrueih uihrgu huigh uihg hruige uiegh rhegr uihrgeh uigh hruigh hrguh irhuiegruighuireg hreuighrueighrueigh ");
        try {
            while (v.get() != null) {
                String[] generateOutOfMemoryStr = new String[99999999];
                System.gc();
            }
            System.out.println("Now v is: " + v.get());
        } catch (OutOfMemoryError oome) {
            System.out.println("Out of memory");
            System.out.println(v.get());
        }
//        Integer weakInt = new Integer(10);
//        WeakReference<Integer> weakReference = new WeakReference<Integer>(weakInt);
//
//        weakInt = null;
//        while (weakReference.get() != null) {
//            System.out.println("Looping...");
//            String[] generateOutOfMemoryStr = new String[999999];
//        }
//        System.out.println("Weak reference collected");

    }
}
