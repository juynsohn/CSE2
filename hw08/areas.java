/*
Eddie (JunYoung) Sohn
Homework 8
File Name : Methods.java
Date : 2015 Oct 27
Purpose : Program that compute the area of circle, rectangle and trapezoid
*/

//import scanner
import java.util.Scanner;

//define class
public class areas {
    
    //main method asking user the type of shape
    public static void main(String args[]) {
    
    Scanner myScanner = new Scanner(System.in);
    
    //while loop continues to ask user to select the shape until valid option is selected
    while(true) {
    
    	System.out.println("Enter the name of the shape to calculate the area : ");
    	System.out.println("(circle, rectangle, trapezoid, exit)");
    	String shape = myScanner.next();
    	
    		if (shape.equals("circle")) {
    			
    			System.out.println("Enter the radius of a circle (must be an integer): ");
    			int a = myScanner.nextInt();
    			double result = area(a);
    			System.out.println("Area is " + result);
    			break;
    			
    		}
    		
    		if (shape.equals("rectangle")) {
    			
    			System.out.println("Enter the length of a rectangle (must be an integer): ");
    			int b = myScanner.nextInt();
    			System.out.println("Enter the width of a rectangle (must be an integer): ");
    			int c = myScanner.nextInt();
    			int result = area(b,c);
    			System.out.println("Area is " + result);
    			break;
    			
    		}
    		
    		if (shape.equals("trapezoid")) {
    		
    			System.out.println("Enter the height of a trapezoid (must be an integer): ");
    			int d = myScanner.nextInt();
    			System.out.println("Enter the base of a trapezoid (must be an integer): ");
    			int e = myScanner.nextInt();
    			System.out.println("Enter the other base of a trapezoid (must be an integer): ");
    			int f = myScanner.nextInt();
    			double result = area(d,e,f);
    			System.out.println("Area is " + result);
    			break;
    		
    		}
    		
    		if (shape.equals("exit")) {
    			
    			break;
    		
    		}

    	}

    }
    
    //Method to compute area of circle until two decimal points
    public static double area(int a) {
    
    //'d' was added after 100 in order to cast 100 into double
    double result = Math.round((a*a*Math.PI)*100)/100d;
    
    return result;
    
    }
    
    //Method to compute area of rectangle
    public static int area(int b, int c) {
    
    int result = b * c;
    
    return result;
    
    }
    
    //Method to compute area of trapezoid
    public static double area(int d, int e, int f) {
    
    double result = d * 0.5 * (e + f);
    
    return result;
    
    }
    
}