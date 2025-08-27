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
public class Problem2 {
        public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input a value for inches: ");
        double inches = input.nextDouble();

        double meters = inches * 0.0254;

        System.out.println(inches + " inches is " + meters + " meters");
    }
}


