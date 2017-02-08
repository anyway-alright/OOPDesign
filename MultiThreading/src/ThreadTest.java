/**
 * Created by Lenovo on 2/8/2017.
 */
public class ThreadTest {
    public static void main(String [] args)
    {


        MyThread myThread=new MyThread();
        Thread thread=new Thread(myThread);
        thread.start();
        System.out.println("From main");
    }
}
