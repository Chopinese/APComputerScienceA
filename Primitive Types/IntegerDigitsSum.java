
import java.util.Scanner;

public class IntegerDigitsSum {
    public static void main(String args[])
    {
        int total = 0;
        System.out.println("enter an integer");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for(int i = 0; i < 4; i++)
        {
            int digit = number%10; //35.1 digit = 1
            total += digit;
            number = number/10;
        }
        System.out.println(total);
    }
}
