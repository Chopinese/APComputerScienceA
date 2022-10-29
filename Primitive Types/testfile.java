public class testfile {
    public static void main(String args[])
    {
        int[][] testbox = {{1, 2, 3},
                         {4, 0, 6},
                         {7, 8, 9}};
        boolean flag = noDupsBox(testbox, 0, 0);
        System.out.println(flag);
    }

    public static boolean noDupsList(int[] myList)
    {
        for (int k = 0; k < 9; k++)
        {
            if (myList[k] == 0)
            {
                System.out.println("error");
                return false;
            }
            for (int m = 0; m < 9; m++)
            {
                if (k != m)
                {
                    if (myList[k] == myList[m])
                    {
                        return false;
                    }
                }

                if (k == 8 && m == 8)
                {
                    return true;
                }
            }
        }
      //  System.out.println("error");
        return false; //check this later
    }

    public static boolean noDupsBox(int[][] mybox, int dim1, int dim2)
    {
        int[] temp_list = new int[9];
        int listcounter = 0;
        for (int i = dim1; i < (dim1 + 3); i++)
        {
            for (int j = dim2; j < (dim2 + 3); j++)
            {
                temp_list[listcounter] = mybox[i][j];
                System.out.print(temp_list[listcounter]);
                listcounter++;
            }
        }
        
        if (noDupsList(temp_list) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
