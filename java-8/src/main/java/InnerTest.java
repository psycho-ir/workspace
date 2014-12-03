/**
 * Created by soroosh on 11/24/14.
 */
public class InnerTest {
    private String name = "soroosh";

    public class A {
        public String getName() {
            return InnerTest.this.name;
        }
    }
}
