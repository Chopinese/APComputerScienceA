import java.util.Scanner;

public class TicTacToe {
    public static void main(String args[]) //make a failsafe if someone puts an x or o where there is one alreaedy there?
    {
        int turn_count = 1;
        char[][] board = new char [3][3];
        Scanner scan = new Scanner(System.in);
        boolean flag = true;

        //prints initial board
        System.out.println("-------");
        for (int k = 0; k < 3; k++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        {
                            System.out.print("| " + board[k][j]);
                        }
                    }
                    System.out.println("|");
                    System.out.println("-------");
                }

        while (flag == true)
        {
            //ends game once board is filled (when 9 moves are played)
            if (turn_count > 8)
            {
                flag = false;
            }

            if (turn_count%2 != 0)
            {
                System.out.print("Enter a row ( 0, 1, 2) for player X: ");
                System.out.print("Enter a column ( 0, 1, 2) for player X: ");
                board[scan.nextInt()][scan.nextInt()] = 'X';
                System.out.println("-------");
                for (int k = 0; k < 3; k++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        if (board[k][j] == 'X' || board[k][j] == 'O')
                        {
                            System.out.print("|" + board[k][j]);
                        }
                        else
                        {
                            System.out.print("| " + board[k][j]);
                        }
                    }
                    System.out.println("|");
                    System.out.println("-------");
                }

            }
            else
            {
                System.out.print("Enter a row ( 0, 1, 2) for player O: ");
                System.out.print("Enter a column ( 0, 1, 2) for player O: ");
                board[scan.nextInt()][scan.nextInt()] = 'O';
                System.out.println("-------");
                for (int k = 0; k < 3; k++)
                {
                    for (int j = 0; j < 3; j++)
                    {
                        if (board[k][j] == 'X' || board[k][j] == 'O')
                        {
                            System.out.print("|" + board[k][j]);
                        }
                        else
                        {
                            System.out.print("| " + board[k][j]);
                        }
                    }
                    System.out.println("|");
                    System.out.println("-------");
                }
            }

            //checks if x player won
            for (int k = 0; k < 3; k++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board[k][j] != 'X')
                    {
                        break;
                    }

                    if (j == 2)
                    {
                        System.out.println("X Player Won!!!");
                        return;
                    }
                }
            }

            for (int k = 0; k < 3; k++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board[j][k] != 'X')
                    {
                        break;
                    }

                    if (j == 2)
                    {
                        System.out.println("X Player Won!!!");
                        return;
                    }
                }
            }

            if ((board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
            {
                System.out.println("X Player Won!!!");
                return;
            }

            //checks if o player won
            for (int k = 0; k < 3; k++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board[k][j] != 'O')
                    {
                        break;
                    }

                    if (j == 2)
                    {
                        System.out.println("O Player Won!!!");
                        return;
                    }
                }
            }

            for (int k = 0; k < 3; k++)
            {
                for (int j = 0; j < 3; j++)
                {
                    if (board[j][k] != 'O')
                    {
                        break;
                    }

                    if (j == 2)
                    {
                        System.out.println("O Player Won!!!");
                        return;
                    }
                }
            }

            if ((board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') || (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'))
            {
                System.out.println("O Player Won!!!");
                return;
            }
            //changes turns
            turn_count++;
        }
    }
}
