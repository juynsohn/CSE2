/*
Eddie (JunYoung) Sohn
Homework 6
File Name : pyramid.java
Date : 2015 Oct 06
Purpose : Ask size of pyramid to user and generate pyramid
*/

//import scanner
import java.util.Scanner;

//define class
public class pyramid {
    
    //define method
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("What size (line) of pyramid do you want to generate ? ");
        int pyramidSize = myScanner.nextInt();
        
        //In order to make the pyramid symmetrical, number of * must be odd.
        
        for (int a = 0; a < pyramidSize; a++) {
            
            for (int b = 1; b < pyramidSize - a; b++) {
                
                System.out.print(" ");
                
            }
            
            for (int c = 0; c < a*2 + 1; c++) {
                
                System.out.print("*");
                
            }
            
            System.out.println();
            
        }
        
    }
        
}
    