/*
Eddie (JunYoung) Sohn
lab 09
File name: coinflipping.java
Date : 2015 Oct 23
Purpose:
*/

//import scanner and random
import java.util.Scanner;
import java.util.Random;

//define class
public class coinflipping {
	
	//main method to ask user for an integer for coin flipping
    public static void main(String[] args) {
    
    Scanner myScanner = new Scanner(System.in);
    
    System.out.println("Type '0' to flip coin once.");
    System.out.println("Type an integer between 1 to 100 to flip coin X times.");
    int a = myScanner.nextInt();
    	
    	while (true) {
    	
    		if (a == 0) {
    		
    		boolean result = flip();
    			
    			if (result == true) {
    				
    				System.out.println("Result is head.");
    				
    			}
    			
    			else {
    				
    				System.out.println("Result is tail.");
    				
    			}
    			
    			break;
    			
    		}
    		
    		if (1 < a && a <= 100) {
    			
    			int headCount = flip(a);
    			
    			System.out.println("Head appeared " + headCount + " times, and Tail appeared " + (a - headCount) + " times.");
    			
    			break;
    			
    		}
    	
    		if (100 < a) {
    		
    		System.out.println("End the program");
    		
    		break;
    			
    		}
    	
    	}
    
    }
    
    public static boolean flip() {
    
    	Random coinflip = new Random();
    	
    	boolean headtail;
    	
    	int b = coinflip.nextInt(2);
    	
    	System.out.println(b);
    	
    		if (b == 0) {
    		
    			headtail = true;
 
    		}
    	
    		else {
    		
    			headtail = false;
    		}
    	
    	return headtail;
    	
    }
    
    public static int flip(int a) {
        
    	Random coinflip = new Random();
    	
    	int headCount = 0;
    	
    	for (int i = 0; i < a; i++) {
    		
    		if (true == coinflip.nextBoolean()) {
    			
    			headCount++;
    			
    		}
    		
    	}
    	
    	return headCount;
    
    }
    
}