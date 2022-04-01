package homework_week_7;

import java.util.Scanner;

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //Scanner declaration for reading the input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your Employee ID:");
        int employeeId = scanner.nextInt();
        System.out.println("Enter Basic Salary:");
        double basicSalary = scanner.nextDouble();
        //calculating HRA,DA,TA and PF
        double hRa = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = calculatePF(basicSalary);

        //calculating the gross salary
        double grossSalary = basicSalary + hRa + da + ta - pf;
        System.out.println(" ---------------------------------------------------");
        System.out.println("| Salary Slip                                      |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| Employee ID:" + employeeId + "                   |");
        System.out.println("|  Employee Name:" + name + "                      |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| BASIC Salary:" + basicSalary + "                  |");
        System.out.println("| HRA 10%     : " + hRa + "                        |");
        System.out.println("| TA 8%       : " + ta + "                         |");
        System.out.println("| DA 9%       : " + da + "                         |");
        System.out.println("| PF -20%     : " + pf + "                         |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("| Gross Salary: " + grossSalary + "                |");
        System.out.println("|--------------------------------------------------|");
        scanner.close();

    }

    //calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    ////calculating DA
    public static double calculateDA(double bsaicSalary) {
        return (bsaicSalary * 8) / 100;
    }
    //calculating TA
    public static double calculateTA(double basicSalary){
        return (basicSalary * 9)/100;
    }
    //calculating PF
    public static double calculatePF(double basicSalary){
        return (basicSalary * 20)/100;
    }
}