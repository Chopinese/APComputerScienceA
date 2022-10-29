import java.util.Scanner;

public class Sudoku {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int[][] board = new int[9][9];
        
        //board preset with a valid solution
        board[1][1] = 5;
        board[2][1] = 9;
        board[1][2] = 6;
        board[2][4] = 4;
        board[1][4] = 9;
        board[1][5] = 8;
        board[1][7] = 2;
        board[1][8] = 1;
        board[2][7] = 8;
        board[4][1] = 2;
        board[4][2] = 7;
        board[4][4] = 5;
        board[4][5] = 9;
        board[4][7] = 6;
        board[4][8] = 8;
        board[5][1] = 4;
        board[5][4] = 6;
        board[5][7] = 9;
        board[7][1] = 6;
        board[7][2] = 5;
        board[7][4] = 1;
        board[7][5] = 3;
        board[7][7] = 4;
        board[7][8] = 2;
        board[8][1] = 1;
        board[8][4] = 2;
        board[8][7] = 5;

        //formats board
        System.out.println("---------------------------------");
        for (int row = 0; row < 9; row++)
        {
            System.out.print("[");
            for (int column = 0; column < 9; column++)
            {
                if (column == 3 || column == 6)
                {
                    System.out.print("[");
                }
                if (board[row][column] == 0)
                {
                    System.out.print(" ? ");
                }
                else
                {
                    System.out.print(" " + board[row][column] + " ");
                }

                if ((column + 1) % 3 == 0)
                {
                    System.out.print("]");
                }

            }
            System.out.println();
            if ((row + 1) % 3 == 0)
            {
               System.out.println("---------------------------------");
            }
        }

        //gap of space
        System.out.println();


        while (true)
        {
            System.out.println("Enter a row (1 - 9) and enter a column (1 - 9) and enter number for that slot (1 - 9)");
            board[scan.nextInt() - 1][scan.nextInt() - 1] = scan.nextInt();

            //makes the preset values constant (couldn't figure out how to use constant)
            board[1][1] = 5;
            board[2][1] = 9;
            board[1][2] = 6;
            board[2][4] = 4;
            board[1][4] = 9;
            board[1][5] = 8;
            board[1][7] = 2;
            board[1][8] = 1;
            board[2][7] = 8;
            board[4][1] = 2;
            board[4][2] = 7;
            board[4][4] = 5;
            board[4][5] = 9;
            board[4][7] = 6;
            board[4][8] = 8;
            board[5][1] = 4;
            board[5][4] = 6;
            board[5][7] = 9;
            board[7][1] = 6;
            board[7][2] = 5;
            board[7][4] = 1;
            board[7][5] = 3;
            board[7][7] = 4;
            board[7][8] = 2;
            board[8][1] = 1;
            board[8][4] = 2;
            board[8][7] = 5;
    
    
            System.out.println("---------------------------------");
            for (int row = 0; row < 9; row++)
            {
                System.out.print("[");
                for (int column = 0; column < 9; column++)
                {
                    if (column == 3 || column == 6)
                    {
                        System.out.print("[");
                    }
    
                    if (board[row][column] == 0)
                    {
                        System.out.print(" ? ");
                    }
                    else
                    {
                        System.out.print(" " + board[row][column] + " ");
                    }

                    if ((column + 1) % 3 == 0)
                    {
                        System.out.print("]");
                    }
    
                }
                System.out.println();
                if ((row + 1) % 3 == 0)
                {
                   System.out.println("---------------------------------");
                }
            }
            
            //checks if board is correct
            if (boardcheck(board) == true)
            {
                System.out.println("You have completed the board!!!");
                return;
            }
            //gap of space
            System.out.println();
        }
    }


    //Functions below

    //checks if there are any duplicates in a three by three box
    public static boolean noDupsBox(int[][] mybox, int dim1, int dim2)
    {
        int[] temp_list = new int[9];
        int listcounter = 0;
        for (int i = dim1; i < (dim1 + 3); i++)
        {
            for (int j = dim2; j < (dim2 + 3); j++)
            {
                temp_list[listcounter] = mybox[i][j];
                listcounter++;
            }
        }
        
        if (noDupsList(temp_list) == true)
        {
            return true;
        }
        else{
            return false;
        }
    }

    //checks if there are any duplicates in any given list of numbers
    public static boolean noDupsList(int[] myList)
    {
        for (int k = 0; k < 9; k++)
        {
            //checks for empty slots (which are filled by default with zero)
            if (myList[k] == 0)
            {
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
        return false; //check this later
    }

    //checks if there are any duplicates in a column
    public static boolean noDupsColumn(int[][] myboard, int column)
    {
        int[]column_list = new int[9];
        int collistcounter = 0;
        for (int n = 0; n < 9; n++)
        {
            column_list[collistcounter] = myboard[n][column];
            collistcounter++;
        }


        if (noDupsList(column_list) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //checks if there are any duplicates in a row
    public static boolean noDupsRow(int[][] myboard, int row)
    {
        int[]row_list = new int[9];
        int rowlistcounter = 0;
        for (int f = 0; f < 9; f++)
        {
            row_list[rowlistcounter] = myboard[row][f];
            rowlistcounter++;
        }

        if (noDupsList(row_list) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    //checks if board is correct
    public static boolean boardcheck(int[][] myboard)
    {
        //checks each box of nine numbers
        if ((noDupsBox(myboard, 0, 0) == true) && (noDupsBox(myboard, 0, 3) == true) && (noDupsBox(myboard, 0, 6) == true) && (noDupsBox(myboard, 3, 0) == true) && (noDupsBox(myboard, 3, 3) == true) && (noDupsBox(myboard, 3, 6) == true) && (noDupsBox(myboard, 6, 0) == true) && (noDupsBox(myboard, 6, 3) == true) && (noDupsBox(myboard, 6, 6) == true))
        {
            //checks each row and column
            for (int y = 0; y < 9; y++)
            {
                if ((noDupsColumn(myboard, y)) != true)
                {
                    return false;
                }

                if ((noDupsRow(myboard, y)) != true)
                {
                    return false;
                }

                if (y == 8)
                {
                    return true;
                }
            }
        }
        //safety case
        return false;
    }
}
