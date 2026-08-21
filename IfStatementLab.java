/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifstatementlab;

import java.util.Scanner;

/**
 *
 * @author gdots
 */
public class IfStatementLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        
        System.out.println("First problem: age");
        System.out.println("Second problem: Temperature Evaluator");
        System.out.println("Third problem: Simple Grade Evaluator");
        System.out.println("Fourth problem: Circle Calculator");
        System.out.println("Fifth problem: Even or Odd Number");
        
        System.out.println();
        
        System.out.println("Enter age");
        int age = one.nextInt();
        
        if (age < 13)
            System.out.println("You are a child");
        else if (age <= 19)
            System.out.println("You are a teenager");
        else
            System.out.println("You are an adult");
        
        System.out.println("Enter temp");
        double temp = one.nextDouble();
        if (temp < 0)
            System.out.println("Freezing point");
        else if (temp <= 25)
            System.out.println("Normal Weather");
        else
            System.out.println("Hot Weather");
        
        System.out.println("Enter your test score");
        int score = one.nextInt();
        
        if (score >= 90)
            System.out.println("Excellent");
        else if (score >= 75)
            System.out.println("GOOD");
        else 
            System.out.println("Needs Improvement");
        
        System.out.println("Enter Radius");
        Double r = one.nextDouble();
       
        if (r <= 0)
            System.out.println("Invalid radius");
        else {
            double area = Math.PI * r * r;
            double circumference = 2 * Math.PI * r;
            
            System.out.println("Area: "+ area);
            System.out.println("Circumference: " + circumference);
        } 
        System.out.println("Enter Number");
        int number = one.nextInt ();
        
        if (number % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");  
    }  
}

