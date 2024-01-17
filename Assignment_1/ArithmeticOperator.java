package KIIT_University.Assignment_1;

//4. Declare two integer variables then apply +,-,*,/,% operations. Also declare suitable variables to store the result.

public class ArithmeticOperator {
    public static void main(String[] args) {
        int x = 20;
        int y = 10;

        int Add = x + y;
        int Sub = x - y;
        int Mul = x * y;
        int Div = x / y;
        int Mod = x % y;

        System.out.println("x + y = "+Add);
        System.out.println("x - y = "+Sub);
        System.out.println("x * y = "+Mul);
        System.out.println("x / y = "+Div);
        System.out.println("x % y = "+Mod);
    }
}
