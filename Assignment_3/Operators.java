package KIIT_University.Assignment_3;

/*
   4. Write a program to show the use of ++, -- and different assignment operators.
 */

public class Operators {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

        //Increment OP
        System.out.println("X before pre-increment : " +x);
        x = ++x;
        System.out.println("X after pre-increment : " +x);

        System.out.println("\nY before post-increment : " +y);
        y = y++;
        System.out.println("Y after post-increment : " +y);

        //Decrement OP
        System.out.println("\nX before pre-decrement : " +x);
        x = --x;
        System.out.println("X after pre-decrement : " +x);

        System.out.println("\nY before post-decrement : " +y);
        y = y--;
        System.out.println("Y after post-decrement : " +y);

        //All Assignment Operators
        int a = 10;
        int b = 20;

        //Add
        System.out.println("\na before addition assignment: " + a);
        a += 5;
        System.out.println("a after addition assignment: " + a);

        //Sub
        System.out.println("\nb before subtraction assignment: " + b);
        b -= 3;
        System.out.println("b after subtraction assignment: " + b);

        //Mul
        System.out.println("\na before multiplication assignment: " + a);
        a *= 2;
        System.out.println("a after multiplication assignment: " + a);

        //Div
        System.out.println("\nb before division assignment: " + b);
        b /= 4;
        System.out.println("b after division assignment: " + b);
    }
}
