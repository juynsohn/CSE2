/*
Eddie (JunYoung) Sohn
Homework 5
File Name : averageGrade
Date : 2015 Sep 30
Purpose : Ask grades to user and compute average grade when user input '999'
*/

//import scanner
import java.util.Scanner;

//define class
public class averageGrade {
    
    //defin method
    public static void main(String[] args) {
        
        //Declare an instance of the Scanner object 
        //Call the Scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //Declare variables
        //'totalGrade' for total amount of Grades
        //'a' to divide and get the average grade
        int totalGrade = 0;
        int a = 0;
        
        while (true) {
            
            System.out.print("Input grade (Input '999' to stop) : ");
            int grade = myScanner.nextInt();
            
            if (grade == 999 && totalGrade == 0) {
                
                System.out.println("Error : Input grades in order to get the average.");
                
            }
            
            if (grade == 999 && totalGrade != 0) {
                
                System.out.println("The average grade is : " + (totalGrade/a));
                break;    
            
            }
            
            if (100 < grade) {
                
                System.out.println("Error : Invalid grade");
                
            }
            
            else {
            
            totalGrade += grade;
            a++;
            
            }
            
        }
            
    }
    
}