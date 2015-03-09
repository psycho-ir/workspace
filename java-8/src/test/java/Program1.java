/**
 * Created by soroosh on 1/26/15.
 */
interface MyInterface1 {  }
interface MyInterface2 extends MyInterface1 {  }

class MyClass1 implements MyInterface1 {  }
class MyClass2 implements MyInterface2 {  }
public class Program1 {

    public static abstract class W{
        public static int counter =0;
        static {
          counter+=1;
        }
    }

    public static class X extends W{
        static {
            W.counter++;
        }
    }


    public static void main(String[] args) {
        a(MyClass1.class);
        a(MyClass2.class);
        System.out.println(W.counter);
        System.out.println(new X());
        System.out.println(new X());
        System.out.println(W.counter);

    }

    public static void a(Class<? extends  MyInterface1> input){
        System.out.println("OK");

    }

}



