/*
Eddie (JunYoung) Sohn
Lab 4
File Name : Calculator
Date : 2015 Sep 18
Purpose : Calculator program using the switch statement, which compute and display
          a+b, a-b, a*b, a/b according to operator.
*/

import java.util.Scanner;

//define class
public class Calculator {
    
    //define main method
    public static void main(String[] args){
    
        //Declare variables
        Scanner myScanner = new Scanner (System.in);
        
        //
        System.out.println("Enter first number : ");
        double a = myScanner.nextDouble();
        
        System.out.println("Enter second number : ");
        double b = myScanner.nextDouble();
        
        System.out.println("Enter the calculation ((+, -, *, /): ");
        String operater = myScanner.next();
        
        switch(operater)
        
        {
            case "+" :
                System.out.print(a+b);
                break;
            case "-" :
                System.out.println(a-b);
                break;
            case "*" :
                System.out.println(a*b);
                break;
            case "/" :
                System.out.println(a/b);
                break;
            default:
                System.out.println("");
                System.out.println("Error: Illegal operator.");
        }
        
        
    }
}