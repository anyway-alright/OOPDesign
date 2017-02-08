import java.util.ArrayList;
import java.util.jar.Attributes;

/**
 * Created by Lenovo on 2/8/2017.
 */
public class NameList {

    private ArrayList<String> names;
    public NameList()
    {
        names=new ArrayList<>();
    }

    public void addNames(String name1,String name2)
    {

        names.add(name1);
        names.add(name2);
    }

    public void printNames()
    {
        for (int i=0;i<2;i++)
        {
            System.out.println(names.get(i));
        }
    }
}
