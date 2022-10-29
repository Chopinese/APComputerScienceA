import java.util.Scanner;

public class ModDiv2 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a monetary value: ");
        double money = Math.round(scan.nextDouble() * 100);

        int dollars = (int)(money/100);
        int quarters = (int)((money%100) / 25);
        int dimes = (int)(((money%100) % 25) / 10);
        int nickels = (int)((((money%100) % 25) % 10) / 5);
        int pennies = (int)((((money%100) % 25) % 10) % 5);
        System.out.println(dollars + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");
    }
}
