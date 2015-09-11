/*
Eddie (JunYoung) Sohn
Lab 3
File Name : Check
Date : 2015 Sep 11
Purpose : Calculate the percentage tip and amount of money each person 
          should pay using 'Scanner'
*/

import java.util.Scanner;

//define class
public class Check {

//define method
    public static void main(String[] args) {
        
        //Declare an instance of the Scanner object 
        //Call the Scanner constructor
        Scanner myScanner = new Scanner (System.in);
        
        //Accept Subtotal
        System.out.print("Enter the original cost of the check in the form xx.xx ");
        double checkCost = myScanner.nextDouble();
        
        //Accept percentage of tip
        //Convert interger tip percentage in decimal value
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
        double tipPercent = myScanner.nextDouble();
        tipPercent /= 100;
        
        //Number of people
        System.out.print("Enther the number of people who went out to dinner: ");
        int numPeople = myScanner.nextInt();
        
        //Declare variables
        //Whole dollar amount of cost
        double totalCost;
        double costPerPerson;
        int dollars; //Whole dollar amount of cost
        int dimes, pennies; //To store digits to the right of the decimal point for the total cost
        
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        
        // '%' operater returns the remainder
        dollars = (int) costPerPerson;
        dimes = (int) (costPerPerson*10) % 10;
        pennies = (int) (costPerPerson*100) % 10;
        
        //Cost per person
        System.out.println("Each person in the group owes $ " + dollars + "." + dimes + pennies);
        
    }
}