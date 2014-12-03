/**
 * Created by soroosh on 11/23/14.
 */
public class Test implements AutoCloseable {
    private String name = "sss";
    private String lastName = "sss";

    public Test() {
    }

    public Test(String name, String lastName) {

        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void close() {
        System.out.println("Closed");
    }
}