import java.util.Scanner;

public class isPrime {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();
        int limit = (int)(Math.sqrt(number));
        for (int i = 2; i <= limit; i++)
        {
            if (number%i == 0)
            {
                System.out.println("This number is not prime.");
                return;
            }
            
            if (i >= limit)
            {
                System.out.println("The number is prime.");
                return;
            }
        }
        System.out.println("The number is prime.");
    }
}
