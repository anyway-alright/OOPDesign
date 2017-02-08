/**
 * Created by Lenovo on 2/8/2017.
 */
public class MyException {

    private int number1;
    private int number2;

    public MyException(int a,int b)
    {
        number1=a;
        number1=b;

    }

    public void divide()
    {
        try {
            System.out.println("The result is " + number1 / number2);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You cant divide by zero");
        }
    }




}
