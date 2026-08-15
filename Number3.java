/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package number3;

import java.util.Scanner;

/**
 *
 * @author gdots
 */
public class Number3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please enter your test score: ");
        double Score=scanner.nextInt();
        
        if (Score<75) {
            System.out.println("Needs Improvement.");
            
        } else if(Score >= 75 && Score <= 89) {
            System.out.println("Good.");
            
        } else if (Score >= 90) {
                System.out.println("Excellent.");
            }
        
        scanner.close();
    }
}

