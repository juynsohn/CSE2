/*
Eddie (JunYoung) Sohn
Homework 3
File Name : Block
Date : 2015 Sep 15
Purpose : Compute the volume and surface area of the block
*/

import java.util.Scanner;

//define class
public class Block {
    
    //define main method
    public static void main(String[] args) {
    
        //Declare an instance of the Scanner object 
        //Call the Scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //Get length, width and height of the block
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();
        
        //Calculatoin for surface area
        double surfArea = 2*(length*height + length*width + width*height);
        //Calculation for volume
        double volume = length*width*height;
        
        System.out.println("");
        System.out.println("The volume of the block of dimensions " + length + " X " + width + " X " + height + " is " + volume + " .");
        System.out.println("The surface Area of the block is " + surfArea + " .");
    }
    
}
        