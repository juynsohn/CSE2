/*
Eddie (JunYoung) Sohn
Homework 3
File Name : Timer
Date : 2015 Sep 15
Purpose : Compute current time, dinner time and amount of time remaining until dineer.
          (Use 24-hour and int) 
*/

import java.util.Scanner;

//define class
public class Timer {
    
    //define main method
    public static void main(String[] args) {
        
        //Declare an instance of the Scanner object 
        //Call the Scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //Get current time
        System.out.print("Enter the current time (in form HHMM) : ");
        int currentTime = myScanner.nextInt();
        
        //Get dinner time
        System.out.print("Enter the time that you will be eating dinner (in form HHMM) : ");
        int dinnerTime = myScanner.nextInt();
        
        //Declare variables
        int hourRemaining; //Amount of hour remaining
        int MinuteRemaining; //Amount of tens minute remaining
        //int onesMinuteRemaining; //Amount of ones minute remaining
        
        hourRemaining = (int) Math.floor((dinnerTime-currentTime)/100);
        MinuteRemaining = (int) (dinnerTime-currentTime) % 100;
        //onesMinuteRemaining = (int) ((dinnerTime-currentTime)*10) % 10;
        
        System.out.println("You have " + hourRemaining + " hours and " + tensMinuteRemaining + " minutes until dinner.");
        
    }
    
}