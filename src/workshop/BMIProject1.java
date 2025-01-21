package workshop;
import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) {
        String empName;
        double empKg,empM,BMI;

        Scanner sc = new Scanner(System.in);
        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" BMI Program by DTI-SAU");
        System.out.println("+++++++++++++++++++++++++");

        System.out.print("Input your name: ");
        empName = sc.next();
        System.out.print("Input your weight(kg): ");
        empKg = sc.nextDouble();
        System.out.print("input your height(m): ");
        empM = sc.nextDouble();
        System.out.println("+++++++++++++++++++++++++");
        double bmi = empKg / (empM * empM);
        System.out.printf("BMI of %s is %.4f\n", empName, bmi);
    }
}
