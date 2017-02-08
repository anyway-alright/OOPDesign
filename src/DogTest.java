/**
 * Created by Lenovo on 2/8/2017.
 */
public class DogTest {
    public static void main(String[] args)
    {
        Animal[] animals=new Animal[2];
        animals[0]=new Dog(20,"yellow");
        animals[1]=new Cat(2,"black");
        for(Animal animal:animals)
        {
            animal.makeNoise();

        }
    }
}
