package KIIT_University.Assignment_3;

/*
   5. WAP to observe the difference between – and ~ operators.
 */

public class OperatorComparison {
    public static void main(String[] args) {

        int x = 10;
        int y = 5;

        System.out.println("x - y : "+(x-y));

        System.out.println("~x (Bitwise Complement) : " + (~x));
        System.out.println("~y (Bitwise Complement) : "+ (~y));
        //Negative numbers are represented in 2's complement in Java.
    }
}
