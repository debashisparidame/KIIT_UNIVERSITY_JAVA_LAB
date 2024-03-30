package KIIT_University.Assignment_3;

/*
   2. Calculate the volume and surface area of a sphere using the following formula:
      V= 4/3 πr3   A = 4 πr2   π=3.14159
      Test the program using CLA for the given radius: 1, 6, 12.2, 0.2
*/

public class SphereCalculator
{

    public static final double PI = 3.141;

    public static void main(String[] args)
    {

        double[] radii = {1, 6, 12.2, 0.2};

        for(double radius : radii)
        {
            double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
            double surfaceArea = 4.0 * PI * Math.pow(radius, 2);

            System.out.printf("Sphere with radius %.2f \n",radius);
            System.out.printf("   ->volume : %.4f\n", volume);
            System.out.printf("   ->Surface area : %.4f\n", surfaceArea);
        }
    }

}

