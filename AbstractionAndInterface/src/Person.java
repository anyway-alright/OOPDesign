import java.util.HashSet;

/**
 * Created by Lenovo on 2/8/2017.
 */
public class Person extends Human implements Animal{
    private String name;
    @Override
    public void eat() {
        System.out.println("A person eats rice");

    }

    @Override
    public void die() {
        System.out.println("A person must die");
    }

    @Override
    public void setName(String name) {
        this.name=name;



    }

    @Override
    public void sleep() {
        System.out.println("A persons average sleep time is 8 hours");
    }

    @Override
    public String getName() {
        return name;
    }
}
