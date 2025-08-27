/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basicdatatypes;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem4 {
       
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for weight
        System.out.print("Input weight in pounds: ");
        double weight = scanner.nextDouble();

        // Prompt user for height
        System.out.print("Input height in inches: ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = (weight * 703) / (height * height);

        // Display result
        System.out.println("Body Mass Index is " + bmi);

        scanner.close();
    }
}



