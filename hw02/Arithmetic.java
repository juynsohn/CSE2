/*
Eddie (JunYoung) Sohn
Homework 2
File Name : Arithmetic
Date : 2015 Sep 07
Purpose : Compute the total cost of items bought, including PA sales tax 6%.
          Need to include Items being bought, Cost per item, Sales tax for each item,
          Total cost (without tax), Total sales tax, Total cost (including tax)
*/

//define class
public class Arithmetic {
    
//define mehtod
public static void main(String[] args) {
    
    //input variables
    int nSocks=3; //Number of pairs of socks
    double sockCost$=2.58; //Cost per pair of socks
    
    int nGlasses=6; //Number of drinking glass
    double glassCost$=2.29; //Cost per glass
    
    int nEnvelopes=1; //Number of envelopes
    double envelopeCost$=3.25; //Cost per envelope
    
    double taxPercent=0.06; //Percentage of tax
    
    double taxSock=taxPercent*sockCost$; //Tax of 1 pair of socks
    double taxGlass=taxPercent*glassCost$; //Tax of 1 glass
    double taxEnvelope=taxPercent*envelopeCost$; //Tax of 1 envelope
    double totalTax=(taxSock*nSocks+taxGlass*nGlasses+taxEnvelope*nEnvelopes); //Total Tax
    
    double totalSockCost$=nSocks*sockCost$; //Total cost of socks
    double totalGlassCost$=nGlasses*glassCost$; //Total cost of glasses
    double totalEnvelopeCost$=nEnvelopes*envelopeCost$; //Total cost of Envelopes
    double totalCost$=(totalSockCost$+totalGlassCost$+totalEnvelopeCost$); //Total Cost
    
    //Cost per item, sales tax for each item
    System.out.println("Cost of 1 pair of socks is " + sockCost$ + " $");
    System.out.println("Tax per 1 pair of socks is " + sockCost$*taxPercent + " $");
    System.out.println("");
    System.out.println("Cost of 1 glass is " + glassCost$ + " $");
    System.out.println("Tax per 1 glass is " + glassCost$*taxPercent + " $");
    System.out.println("");
    System.out.println("Cost of 1 envelope is " + envelopeCost$ + " $");
    System.out.println("Tax per 1 envelope is " + envelopeCost$*taxPercent + " $");
    System.out.println("");
    
    //How many of given items being bought, total cost of each items before tax, total purchase
    System.out.println("Quantitiy       Item        Cost");
    System.out.println(nSocks + "               Socks       " + totalSockCost$);
    System.out.println(nGlasses + "               Glass       " + totalGlassCost$);
    System.out.println(nEnvelopes + "               Envelope    " + totalEnvelopeCost$);
    System.out.println("");
    System.out.println("Subtotal " + totalCost$ + " $");
    System.out.println("Tax " + Math.round(totalTax*100)/100.0 + " $");
    System.out.println("Total " + Math.round((totalCost$+totalTax)*100)/100.0 + " $");
    
    }
}