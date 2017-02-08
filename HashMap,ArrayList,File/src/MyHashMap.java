import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lenovo on 2/8/2017.
 */
public class MyHashMap {
    private String name;

    private Map<String,Integer> weights;
    public MyHashMap()
    {
        weights=new HashMap<>();
    }

    public void putValues(String name,int weight)
    {
        this.name=name;
        weights.put(this.name,weight);
    }
    public void printWeights()
    {
        System.out.println(weights.get(name));
    }
}
