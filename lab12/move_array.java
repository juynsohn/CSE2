/*
Eddie (JunYoung) Sohn
lab 12
File Name: move_array
Date: 2015 Nov 13
purpose:
 */

import java.util.Scanner;
import java.util.Random;

public class move_array {
	
	public static void main(String[] args){
	
		Scanner myScanner = new Scanner(System.in);
		Random numbers = new Random();
		
		System.out.println("Enter the size of the Array :");
		int a = myScanner.nextInt();
		
		try{

			int[] lab12 = new int [a];
		
			for (int b = 0; b < lab12.length; b++) {
			
				lab12[b] = numbers.nextInt(101);
			
			}
			
			System.out.println("Input Array:");
		
			for (int b = 0; b < lab12.length; b++) {
			
				System.out.print(lab12[b] + " ");
				
			}
		
			System.out.println();
			System.out.println("Enter the number of index to move :");
			int b = myScanner.nextInt();
			int[] lab12v2 = new int [a];
			
			try {
				
				for (int c = 0; c < b; c++) {
					
					 lab12v2[c] = lab12[c];
					
				}
				
				for (int d = b; d < lab12.length - 1; d++) {
					
					lab12v2[d] = lab12[d+1];
					
				}
				
				lab12v2[lab12.length - 1] = lab12[b];
				
			} catch (Exception e) {
				
				System.out.println("Error occured: Enter proper Index number.");
				System.out.println("No Change Occurred.");
				
			}
			
			System.out.println("Output Array:");
			
			for (int e = 0; e < lab12v2.length; e++) {
			
				System.out.print(lab12v2[e] + " ");
				
			}
			
		} catch (Exception e) {
			
			System.out.println("Error occured : Enter integer.");
			 
		}
		
	}
	
}