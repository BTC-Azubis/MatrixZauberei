package matrixzauberei.utilities;
import java.util.Scanner;

/**
 * 
 * @author Jesse Gollub
 */
public class MyIO
{
    /**
     * prints String into System.out
     * @param text 
     */
    public static void print (String text)
    {
        System.out.println(text);
    }
    
    /**
     * gets next Input in System.in
     * @return 
     */
    public static String getNextInput ()
    {
        Scanner keyboard = new Scanner(System.in);
        return keyboard.next();
    }
}
