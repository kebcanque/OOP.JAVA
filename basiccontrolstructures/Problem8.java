package basiccontrolstructures;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Problem8 {
    
}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Input number of terms: ");
        int terms = scanner.nextInt();

        // Display cubes from 1 to 'terms'
        for (int i = 1; i <= terms; i++) {
            int cube = i * i * i;
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + cube);
        }

        scanner.close();
    }

