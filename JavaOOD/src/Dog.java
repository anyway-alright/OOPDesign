/**
 * Created by Lenovo on 2/8/2017.
 */
public class Dog extends Animal{

    public Dog(int weight, String color) {
        super(weight, color);

    }

    @Override
    public void makeNoise() {
        System.out.println("A dog of color "+getColor()+" and weight " + getWeigth()+" kg is "+"barking");


    }
}
