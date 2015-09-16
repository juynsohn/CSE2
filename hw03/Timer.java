/*
Eddie (JunYoung) Sohn
Homework 3
File Name : Timer
Date : 2015 Sep 15
Purpose : Compute current time, dinner time and amount of time remaining until dineer.
          (Use 24-hour and int) 
*/

//import scanner
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
        int minuteRemaining; //Minute remaining until dinner
        int hourRemaining; //Hour remaining until dinner
        double curInMinute; //Current time in Minutes, In 'Hour*60 + minutes' (e.g. 13:10 = 13*60 + 10 = 790 minutes)
        double dinInMinute; //Dinner time in Minutes, In 'Hour*60 + minutes' (e.g. 18:00 = 18*60 = 1080 minutes)
        double timeRemaining; //Time remaining until dinner in Minutes
        
        curInMinute = Math.floor(currentTime/100)*60 + (currentTime % 100); //Convert current time to minute
        dinInMinute = Math.floor(dinnerTime/100)*60 + (dinnerTime % 100); //Convert dinner time to minute
        timeRemaining = dinInMinute - curInMinute; //Time remaining until dinner in minute
        
        hourRemaining = (int) Math.floor(timeRemaining/60); //Hours remaining until dinner
        minuteRemaining = (int) timeRemaining % 60; //Minutes remaining until dinner
        
        System.out.println("You have " + hourRemaining + " hour(s) and " + minuteRemaining + " minute(s) until dinner.");
        
        /*
        I converted dinner time and current time into minutes then calculated the difference
        in order to make 60 minutes = 1 hour. 
        To get remaining hour, I divided total time remaining (in minutes) by 60 and used 
        Math.floor() function in order to get hour. 
        For minutes, I used % to get the remaining minutes.
        */

    }
    
}