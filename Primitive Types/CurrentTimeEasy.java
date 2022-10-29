import java.util.Scanner;

public class CurrentTimeEasy {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes: ");
        long minutes = scan.nextLong();
        long years = minutes/525600;
        long days = (minutes%525600)/1440;
        System.out.println(minutes + " minutes is approximately " + years + " years " + days + " days.");
    }
}
