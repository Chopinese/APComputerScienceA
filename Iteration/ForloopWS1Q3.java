public class ForloopWS1Q3
{
    public static void main(String args[])
    {
        int sum = 0; //is this suppose to be here?
        for (int x = 0; x < 25; x++)
        {
            if (x % 2 == 0)
            {
                sum = sum + x;
            }
        }
        System.out.println(sum);
    }
}