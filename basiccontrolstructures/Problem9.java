package basiccontrolstructures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem9 {
    
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for number of rows
        System.out.print("Input number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for each row
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }

        scanner.close();
    }


