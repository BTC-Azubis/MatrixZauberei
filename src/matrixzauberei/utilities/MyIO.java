package matrixzauberei.utilities;
import java.util.Scanner;

public class MyIO
{
    public static void print (String text)
    {
        System.out.println(text);
    }
    
    public static String getNextInput ()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next();
    }
}
