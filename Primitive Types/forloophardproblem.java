public class forloophardproblem {
    public static void main(String args[])
    {
        int k = 4;
        int m;
         for (int i = 1; i <= 5; i++)
         {
            m = 0;
            for (int j = 1; j <= 5; j++)
            {
                if (i == j || k == m)
                {
                    System.out.print('0');
                }
                else
                {
                    System.out.print('1');
                }
                m++;
         //       System.out.println("x" + m);
            }
            System.out.println();
            k--;

        } 

 /*        for (int i = 4; i >= 0; i--)
        {
            for (int j = 0; j <= 4; j++)
            {
                if (i < j)
                {
                    System.out.print(1);
                }
                else if (i == j)
                {
                    System.out.print(0);
                }
                else 
                    System.out.print(1);
            }
            System.out.println();
        } */

        }
    }
