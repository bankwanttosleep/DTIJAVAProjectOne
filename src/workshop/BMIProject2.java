package workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class BMIProject2 {
    public static void main(String[] args) throws IOException {
        String empName;
        double empKg,empM,BMI;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.println("+++++++++++++++++++++++++");
        System.out.println(" BMI Program by DTI-SAU");
        System.out.println("+++++++++++++++++++++++++");

        System.out.print("Input your name: ");
        empName = reader.readLine();
        System.out.print("Input your weight(kg): ");
        empKg = Double.parseDouble(reader.readLine());
        System.out.print("input your height(m): ");
        empM = Double.parseDouble(reader.readLine());
        System.out.println("+++++++++++++++++++++++++");
        double bmi = empKg / (empM * empM);
        System.out.printf("BMI of %s is %.4f\n", empName, bmi);


    }
}
