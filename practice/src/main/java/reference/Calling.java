package reference;

/**
 * Created by soroosh on 1/14/15.
 */
public class Calling {
    public static void main(String[] args) {
        class A{
            void run(){
                System.out.println("run in a");
            }
            void call(){
                this.run();
            }
        }

        class B extends A{
            void run(){
                System.out.println("run in b");
            }

            void call(){
                super.call();
            }
        }

        B b = new B();
        b.call();

    }
}
