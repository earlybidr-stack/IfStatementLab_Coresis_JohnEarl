/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number.pkg2;

import java.util.Scanner;

/**
 *
 * @author gdots
 */
public class Number2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter today's temperature in Celsius: ");
        double Temperature=scanner.nextInt();
        
        if (Temperature<0) {
            System.out.println("Freezing point.");
            
        } else if(Temperature >= 0 && Temperature <= 25) {
            System.out.println("Normal weather.");
            
        } else if (Temperature >= 25) {
                System.out.println("Hot weather.");
            }
        
        scanner.close();
    }
}

