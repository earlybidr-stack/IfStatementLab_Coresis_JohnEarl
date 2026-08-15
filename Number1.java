/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.number1;

import java.util.Scanner;

/**
 *
 * @author gdots
 */
public class Number1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int Age=scanner.nextInt();
        
        if (Age<13) {
            System.out.println("You are a Child.");
        } else if(Age >= 13 && Age <= 19) {
            System.out.println("You are a teenager.");
        } else if (Age >= 20) {
                System.out.println("You are an adult.");
            }
        
        scanner.close();
    }
}



