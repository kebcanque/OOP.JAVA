/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package basiccontrolstructures;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem2 {
    public static void main(String[] args) {
        {
            try (Scanner scanner = new Scanner(System.in)) {
                System.out.print("Enter a number: ");
                int number = scanner.nextInt();
                
                if (number % 3 == 0) {
                    System.out.println(number + " is divisible by 3");
                } else {
                    System.out.println(number + " is not divisible by 3");
                }   }
        }
    }

}