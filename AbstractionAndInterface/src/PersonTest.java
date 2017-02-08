/**
 * Created by Lenovo on 2/8/2017.
 */
public class PersonTest {
    public static void main(String[] args)
    {
        Person person =new Person();
        person.setName("Imran");
        System.out.println(person.getName()+"  is a a persons name");

        person.eat();
        person.die();
        person.sleep();
    }
}

