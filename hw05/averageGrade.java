/*
Eddie (JunYoung) Sohn
Homework 5
File Name : averageGrade
Date : 2015 Sep 30
Purpose : Ask grades to user and compute average grade when user input '999'
*/

// *Because Lehigh coursesite shows grade to second decimal point, this program is also designed
//  to round off the grades to two decimal places.

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
        //variables in 'double' form in order to get the decimal point
        double totalGrade = 0;
        double a = 0;
        
        while (true) {
            
            System.out.print("Input grade (Input '999' to stop) : ");
            double grade = myScanner.nextDouble();
            
            if (grade == 999 && totalGrade == 0) {
                
                System.out.println("Error : Input grades in order to get the average.");
                break;
                
            }
            
            if (grade == 999 && totalGrade != 0) {
                
                double averageGrade;
                averageGrade = (totalGrade/a);
                System.out.println("The average grade is : " + (Math.round(averageGrade*100d)/100d));
                break;    
            
            }
            
            if (grade < 0 || 100 < grade) {
                
                System.out.println("Error : Invalid grade");
                
            }
            
            else {
            
            totalGrade += grade;
            a++;
            
            }
            
        }
            
    }
    
}