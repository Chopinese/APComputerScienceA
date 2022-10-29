
import java.util.*;

public class Average 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Input a number");
        double num1 = scan.nextDouble();

        System.out.println("Input another number");
        double num2 = scan.nextDouble();

        System.out.println("Input a third number");
        double num3 = scan.nextDouble();

        double avg = (num1 + num2 + num3)/3;
        System.out.println(avg);
    }
}