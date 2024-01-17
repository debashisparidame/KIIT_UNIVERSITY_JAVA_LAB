package KIIT_University.Assignment_2;

/*
3. Wap to define variables for all the shapes given below. Define separate operations for different figures.

a. set required data

b. calculate area of a shape and

c. display the details of that shape.

The geometric shapes are - a) circle, b)triangle, c)rectangle.
 */

public class AreaOfShapes {
    public static void main(String[] args) {
        double CirRad = 5;
        double TriLength = 6.8;
        double TriBreath = 9.5;
        double Rectlength = 20;
        double RectBreath = 10;

        double CirArea = 3.14 * CirRad * CirRad;
        double TriArea = 0.5 * TriLength * TriBreath;
        double RectArea = Rectlength * RectBreath;

        System.out.println("Area of circle is = "+CirArea);
        System.out.println("Area of triangle is = "+TriArea);
        System.out.println("Area of rectangle is = "+RectArea);
    }
}
