/**
 * Created by soroosh on 11/24/14.
 */
public class InnerTestProgram {
    public static void main(String... args) {
        InnerTest innerTest = new InnerTest();
        InnerTest.A a = innerTest.new A();
        System.out.println(a.getName());
    }
}
