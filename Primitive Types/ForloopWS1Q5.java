import java.util.Scanner;

public class ForloopWS1Q5 {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String password = "fatcat123";
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Enter your password: ");
            String guessPass = scan.next();
            if (guessPass.equals(password))
            {
                System.out.println("Access granted.");
                break;
            }
            else if ((guessPass.equals(password) == false) &&  i == 2)
            {
                System.out.println("I am sorry, your account is closed at this time.");
            }
        }
    }
    
}
