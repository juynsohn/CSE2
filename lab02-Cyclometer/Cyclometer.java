/*
Eddie (JunYoung) Sohn
Name: Cyclometer
Date : 2015 Sep 04
lab 2
Purpose : Measure elapsed time and number of rotaions of the 
          front wheel of bicycle during the trips to calculate distance traveled
*/

//define class
public class Cyclometer {

//define method
public static void main(String[] args) {
    
    //input data
    int secsTrip1=480; //Time taken for first trip (in seconds)
    int secsTrip2=3220; //Time taken for second trip (in seconds)
    int countsTrip1=1561; //Number of rotations of the front wheel during first trip (in inch)
    int countsTrip2=9037; //Number of rotations of the front wheel during second trip (in inch)
    double wheelDiameter=27.0; //Diameter of the front wheel (in inch)
    double pi=3.14159; //π, Ratio of the circumference of circle to it diameter
    
    int SecondsPerMinute=60; //Define how many seconds are in 1 minute
    int FeetPerMile=5280; //Define how many feet are in 1 mile
    int InchesPerFoot=12; //Define how many inches are in 1 foot
    double distanceTrip1, distanceTrip2, totalDistance; //Variables to store values
    
    //Change time unit from second to minute
    System.out.println("Trip 1 took " + secsTrip1/SecondsPerMinute + " minutes and had " + countsTrip1 + " counts.");
    System.out.println("Trip 2 took " + secsTrip2/SecondsPerMinute + " minutes and had " + countsTrip2 + " counts.");
    
    /*
    Calculate the total distance of trip using Circumference = 2πr and number of counts
    Change distance unit from inch to miles
    */
    distanceTrip1=(countsTrip1*wheelDiameter*pi)/(InchesPerFoot*FeetPerMile); //
    distanceTrip2=(countsTrip2*wheelDiameter*pi)/(InchesPerFoot*FeetPerMile); //
    totalDistance=distanceTrip1+distanceTrip2; //
    
    //Print out the output data
    System.out.println("Trip 1 was " + distanceTrip1 + " miles");
    System.out.println("Trip 2 was " + distanceTrip2 + " miles");
    System.out.println("The total distance is "+ totalDistance + " miles");
    
    
    }
}