import java.util.Scanner;

public class LotteryDigits {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int lottery_number = (int)(Math.random() * 90) + 10;
        System.out.println("Enter a two digit number: ");
        int user_number = scan.nextInt();
        if (lottery_number == user_number)
        {
            System.out.println("You have won the grandprize: $10,000!");
        }
        else if (((lottery_number%10) == (user_number/10)) && (user_number%10) == (lottery_number/10))
        {
            System.out.println("You have won this prize: $3,000!");
        }
        else if ((lottery_number%10) == (user_number%10) || (lottery_number%10) == (user_number/10) || (lottery_number/10) == (user_number%10) || (lottery_number/10) == (user_number/10))
        {
            System.out.println("You have won this prize: $1,000.");
        }
    }

}
