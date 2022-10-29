
import java.util.Scanner;

public class AdditionMultSubDiv {
    public static void main(String args[])
    {
        System.out.print("What do you want to practice? Type 1 for addition, 2 for subtraction, or 3 for multiplication: ");
        Scanner scan = new Scanner(System.in);
        int c = (int)(System.currentTimeMillis())%10;
        int d = Math.abs((int)((System.currentTimeMillis())/ 10) % 10);
        int x = scan.nextInt();
        if (x == 1)
        {
            System.out.print("What is " + c + " + " + d + " ? ");
            int num = scan.nextInt();
            if (c + d == num)
            {
                System.out.println(c + " + " + d + " = " + num + " is true");
            }
            else
            {
                System.out.println(c + " + " + d + " = " + num + " is false");
            }
        }
        else if (x == 2)
        {
            System.out.print("What is " + c + " - " + d + " ? ");
            int num = scan.nextInt();
            if (c - d == num)
            {
                System.out.println(c + " - " + d + " = " + num + " is true");
            }
            else
            {
                System.out.println(c + " - " + d + " = " + num + " is false");
            }
        }
        else if (x == 3)
        {
            System.out.print("What is " + c + " * " + d + " ? ");
            int num = scan.nextInt();
            if (c * d == num)
            {
                System.out.println(c + " * " + d + " = " + num + " is true");
            }
            else
            {
                System.out.println(c + " * " + d + " = " + num + " is false");
            }
        }
    }

}
