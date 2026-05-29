package Operators.Assignment;

public class AssignmentDemo_op{
    public static void main(String[] args){
        int x = 4;
        int y = 7;
        int z = 2;

        y /= (x += ( z &= (y %= 5)));

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

    }
}
