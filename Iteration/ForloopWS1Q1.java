import java.util.Scanner;

public class ForloopWS1Q1
{
    public static void main(String args[])
    {
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter a number: ");
            sum += scan.nextInt();
        }
        System.out.println(sum);
    }
}