import java.util.Scanner;

public class Mean {
    
    public static void main(String[] args) {
        
        Scanner myScanner = new Scanner (System.in);
        
        System.out.println("Enter the first number : ");
        double first = myScanner.nextDouble();
        
        System.out.println("Enter the second number : ");
        double second = myScanner.nextDouble();
        
        System.out.println("Enter the thrid number : ");
        double third = myScanner.nextDouble();
        
        double mean = (first + second + third) /3;
        
        System.out.println("The mean value of three number is : " + mean);
        
    }
}