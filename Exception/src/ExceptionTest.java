/**
 * Created by Lenovo on 2/8/2017.
 */
public class ExceptionTest {
    public static void main(String[] args)
    {
        MyException myException=new MyException(1,0);

        FileException fileException=new FileException();
        myException.divide();
        fileException.readFile();
    }
}
