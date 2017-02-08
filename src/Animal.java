/**
 * Created by Lenovo on 2/8/2017.
 */
public abstract class Animal {
    private int weight;
    private String color;
    public Animal(int weight,String color)
    {
        this.weight=weight;
        this.color=color;
    }

    public int getWeigth()
    {
        return weight;
    }

    public String getColor()

    {
        return color;
    }

    public abstract void makeNoise();

}
