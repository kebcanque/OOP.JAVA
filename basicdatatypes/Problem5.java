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
public class Problem5 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Input distance in meters: ");
        double distance = input.nextDouble();

        System.out.print("Input hour: ");
        int hours = input.nextInt();

        System.out.print("Input minutes: ");
        int minutes = input.nextInt();

        System.out.print("Input seconds: ");
        int seconds = input.nextInt();

        
        int totalSeconds = hours * 3600 + minutes * 60 + seconds;

        
        double metersPerSecond = distance / totalSeconds;
        double kilometersPerHour = (distance / 1000.0) / (totalSeconds / 3600.0);
        double milesPerHour = (distance / 1609.0) / (totalSeconds / 3600.0);

      
        System.out.printf("Your speed in meters/second is %.8f%n", metersPerSecond);
        System.out.printf("Your speed in km/h is %.8f%n", kilometersPerHour);
        System.out.printf("Your speed in miles/h is %.8f%n", milesPerHour);
    }
}


