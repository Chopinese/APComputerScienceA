public class OperatorPrecedence {
    public static void main(String args[])
    {
        int x = 6;
        int y = -4;
        int z = 0;
        z = x++;
        y = ++z;
        System.out.println("int x=" + x + "\n y =" + y + "\n z = " + z);
    }
}
