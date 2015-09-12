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
        int minuteRemaining;
        int hourRemaining;
        double curInMinute;
        double dinInMinute;
        double timeRemaining;
        
        curInMinute = Math.floor(currentTime/100)*60 + (currentTime % 100); //Convert current time in minute
        dinInMinute = Math.floor(dinnerTime/100)*60 + (dinnerTime % 100); //Convert dinner time in minute
        timeRemaining = dinInMinute - curInMinute; //Time remaining until dinner in minute
        
        hourRemaining = (int) Math.floor(timeRemaining/60); //Hours remaining until dinner
        minuteRemaining = (int) timeRemaining % 60; //Minutes remaining until dinne
        
        System.out.println("You have " + hourRemaining + " hours and " + minuteRemaining + " minutes until dinner.");
        
    }
    
}