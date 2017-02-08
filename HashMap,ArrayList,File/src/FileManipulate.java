import java.io.*;

/**
 * Created by Lenovo on 2/8/2017.
 */
public class FileManipulate {
    private File file;
    private FileReader fileReader;
    public  FileManipulate()
    {
        file=new File("F:/myFile.txt");

    }
    public void readFile()
    {
        try {
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String text=null;
            try {
                while ((text=bufferedReader.readLine())!=null)
                {
                    System.out.println(text);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
