package KIIT_University.Assignment_2;

//1. The basic salary of an employee is 12000. wap in java to compute gross and net salary of that employee Where HRA = 15%, and DA = 110%, PF =

public class EmployeeSalary {
    public static void main(String[] args) {
        double basicsalary = 12000;
        double hrapercentage = 0.15;
        double dapercentage = 1.10;
        double pfpercentage = 0.12;

        double hra = basicsalary * hrapercentage;
        double da = basicsalary * dapercentage;
        double pf = basicsalary * pfpercentage;

        double grosssalary = basicsalary + hra + da;
        double netsalary = grosssalary - pf;

        System.out.println("Basic Salary = "+basicsalary);
        System.out.println("HRA = "+hra);
        System.out.println("DA = "+da);
        System.out.println("PF = "+pf);
        System.out.println("Gross Salary = "+grosssalary);
        System.out.println("Net Salary = "+netsalary);
    }
}
