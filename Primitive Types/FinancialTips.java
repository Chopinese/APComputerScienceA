import java.util.Scanner;

public class FinancialTips {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = scan.nextDouble();
        double gratuityrate = scan.nextDouble();
        double gratuity = subtotal * (gratuityrate/100);
        double total = gratuity + subtotal;
        System.out.println("");
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}