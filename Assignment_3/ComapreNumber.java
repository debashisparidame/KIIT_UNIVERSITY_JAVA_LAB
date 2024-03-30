package KIIT_University.Assignment_3;

/*
   3. WAP in JAVA to find the smaller and greater number among two numbers read from CLA using ternary operator.
  ----------------------------------------------
   For Command Line Run
     ->first choose the program path then
     ->java ComapreNumber.java 2 5
        here 2 5 are two arguments

*/

public class ComapreNumber
{
    public static void main(String[] args)
    {

        if(args.length != 2)
        {
            System.err.println("Please provide two numbers as arguments.");
            return;
        }

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        int smaller = (num1 < num2) ? num1 : num2;
        int greater = (num1 > num2) ? num1 : num2;

        System.out.println("The smaller number is : " +smaller);
        System.out.println("The greater number is : " +greater);
    }
}
