/*
Eddie (JunYoung) Sohn
lab 11
File name: lab11.java
Date: 2015 Nov 06
Purpose:
*/

import java.util.Random;
import java.util.Arrays;

public class lab11 {
	
	private int[] array1;
	private int[] array2;
	private int[] array3;
    
    public static void main(String[] args) {
        
		Random array = new Random();
    	
    	int[] array1 = new int [20];
    	int[] array2 = new int [10];
    	int[] array3 = new int [30];
    	
    	for (int a = 0; a < array1.length; a++) {
    	
    		array1[a] = array.nextInt(101); 
    		
    	}
    	
    	for (int a = 0; a < array2.length; a++) {
    		
    		array2[a] = array.nextInt(101);
   
    	}
    	
    	System.out.println("Array 1 :");
    	
    	for (int a = 0; a < array1.length; a++) {
    		
    		System.out.print(array1[a] + " ");
    		
    	}
    	
		System.out.println();
		System.out.println("Array 2 :");
		
    	for (int a = 0; a < array2.length; a++) {
    		
    		System.out.print(array2[a] + " ");
    	}
    	
    	System.out.println("");
    	
    	for (int a = 0; a < array1.length; a++) {
    		
    		array3[a] = array1[a];
    		
    	}
    	
    	for (int a = array1.length; a < array3.length; a++) {
    		
    		array3[a] = array2[a - 20];
    		
    	}
    	
    	sortArray(array3);
    	System.out.println("Array 3 :");
    	
    	for (int a = 0; a < array3.length; a++) {
    		
    		System.out.print(array3[a] + " ");
    		
    	}
    	
    	System.out.println("");
    	
    }
    
    public static void sortArray(int[] arrayX) {
    	
    	Arrays.sort(arrayX);
    	
    }
    
}