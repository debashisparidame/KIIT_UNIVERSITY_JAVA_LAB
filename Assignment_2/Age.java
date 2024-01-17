package KIIT_University.Assignment_2;

/*
2. WAP in java to defines variables to store your name, current age, previous age and next age. Perform following opertaions:

a. To set your name and current age.

b. That can calculate and set your new age after the years that is equal to last digit of your current age.

c. That can calculate and set your new age before the years that is equal to first digit of your current age.

d. To show your name along with current, previous and next age.
 */
public class Age {
    public static void main(String[] args) {
        String name = "Debashis";
        int age = 23;
        int prevage, nextage;
        prevage = age-(age/10);
        nextage = age+(age%10);
        System.out.println("Name is = "+name);
        System.out.println("Current Age is = "+age);
        System.out.println("Previous Age is = "+prevage);
        System.out.println("Next Age is = "+nextage);
    }
}
