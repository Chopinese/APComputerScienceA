import java.util.Scanner;

public class PoundstoKilos {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        double pounds = scan.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println("");
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
    }
}
