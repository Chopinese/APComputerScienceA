
import java.util.Scanner;

public class ForLoopDisplay {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String choice = scan.nextLine();
        System.out.println("Enter a number: ");
        int limit = scan.nextInt();
        if (choice.equals("A"))
        {
            for (int i = 1; i < limit + 1; i++)
            {
                for (int j = 1; j < i + 1; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
        else if (choice.equals("B"))
        {
            for (int i = limit + 1; i > 1; i--)
            {
                for (int j = 1; j < i; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            } 
        }
        else if (choice.equals("C"))
        {
            for (int i = 1; i < limit + 1; i++)
            {
                for (int k = (limit - i); k > 0; k--)
                {
                    System.out.print("  ");
                }
                for (int j = i; j > 0; j--)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            } 
        }
        else 
        {
            for (int i = limit + 1; i > 1; i--)
            {
                for (int k = 0; k <= limit - i; k++)
                {
                    System.out.print("  ");
                }
                for (int j = 1; j < i; j++)
                {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }

    }
}
