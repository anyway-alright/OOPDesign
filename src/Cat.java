/**
 * Created by Lenovo on 2/8/2017.
 */
public class Cat extends Animal {
    public Cat(int weight, String color) {
        super(weight, color);
    }

    @Override
    public void makeNoise() {
        System.out.println("A cat of color "+getColor()+" and weight " + getWeigth()+" kg is "+"meauing");

    }


}
