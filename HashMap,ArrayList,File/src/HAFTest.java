/**
 * Created by Lenovo on 2/8/2017.
 */
public class HAFTest {
    public static void main(String[] args)
    {
        NameList nameList=new NameList();
        nameList.addNames("Imran","Mithun sir");
        nameList.printNames();

        FileManipulate fileManipulate=new FileManipulate();
        fileManipulate.readFile();

        MyHashMap myHashMap=new MyHashMap();
        myHashMap.putValues("imran",60);
        myHashMap.printWeights();
    }
}
