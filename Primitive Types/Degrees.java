
import java.util.*;

public class Degrees {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a temperature in Celcius");

        double celsius = scan.nextDouble();
        //9.0 instead of 9 must be used to get a double quotient instead of an int quotient
        double farenheit = (9.0/5) * celsius + 32;

        System.out.println("In degrees farenheit:" + farenheit);
    }
}