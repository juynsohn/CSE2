/*
Eddie (JunYoung) Sohn
hw 10
File name: MineSweeper.java
Date : 2015 Nov 11
Purpose : MineSweeper
*/

//Import Random and Scanner
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
        
        //declare private varibles to use insdie the class
	    private String[][] mineSweep;
	    private int mineCount;
	    private int xCoordinate;
	    private int yCoordinate;
	    
	    //Main Method which command to set mines, get number of mines around, and print the game
	    public static void main(String[] args){
	    
	    	Scanner myScanner = new Scanner (System.in);
	    	
	    	System.out.println("Enter the size of MineSweeper (N*N):");
	    	int a = myScanner.nextInt();
	    	System.out.println("Enter the number of mines :");
	    	int b = myScanner.nextInt();
	    	
	    	MineSweeper game = new MineSweeper(a);
	        game.declareMines(b);
	        game.getNumbers();
	        game.printGame();
	    
	    }
	    
	    //Method to create array to display MIneSweeper
	    public MineSweeper(int a) {
	    	
	    	xCoordinate = a;
	    	yCoordinate = a;
	    	mineSweep = new String[yCoordinate][yCoordinate];
	    	
	    }
        
        //Declare dummy varible '-' in order to sepearte mines and numbers
	    public void declareMines(int mineCount) {

	        for(int a = 0; a < xCoordinate; a++) {
	        	
	            for(int b = 0; b < yCoordinate; b++) {
	            	
	            	mineSweep[a][b] = "-";
	            	
	            }
	            
	        }
            
            //Random to create random numbers
	        Random mines = new Random();
	        
	        //Declare 'M' (mines) for random coordinates
	        do {
	        
	        	for(int i = 0; i < mineCount; i++) {
	        	
	        		int xValue = mines.nextInt(xCoordinate);
	        		int yValue = mines.nextInt(yCoordinate);

	        		mineSweep[xValue][yValue] = "M";
	        		
	        		//'if' statement to prevent number of mines go over the value user set
	        		if(realMineCheck() >= mineCount) {
	        			
	        			break;
	        			
	        		}
	            	
	        	}
	        	
	        } while (realMineCheck() < mineCount);
	     
	    }
	    
	    //Method to prevent Mines getting created at same position twice
	    public int realMineCheck() {
	    	
	    	int realMines = 0;
	    	
	    	for(int a = 0; a < xCoordinate; a++) {
            	
        		for (int b = 0; b < yCoordinate; b++) {
        		
        			if(mineSweep[a][b] == "M") {
        			
        				realMines++;
        				
        			}
        		
        		}
        	
        	}
	    	
	    	return realMines;
	    
	    }
        
        //Method to replace dummy data '-' with number of mines around
	    public void getNumbers() {
	    	
	        for(int a = 0; a < xCoordinate; a++) {
	        	
	            for(int b = 0; b < yCoordinate; b++) {
	            	
	                if(mineSweep[a][b] == "-") {
	                	
	                	//Empty "" was added to convert int to String
	                	mineSweep[a][b] = getMineNumber(a, b) + "";
	                	
	                }
	                
	            }
	            
	        }
	        
	    }
	    
	    //Method to get number of mines around
	    public int getMineNumber(int a, int b) {

	        int mineNumber = 0;

	        if(mineExist(a-1, b-1)) mineNumber++;
	        if(mineExist(a-1, b)) mineNumber++;
	        if(mineExist(a-1, b+1)) mineNumber++;
	        if(mineExist(a, b-1)) mineNumber++;
	        if(mineExist(a, b+1)) mineNumber++;
	        if(mineExist(a+1, b-1)) mineNumber++;
	        if(mineExist(a+1, b)) mineNumber++;
	        if(mineExist(a+1, b+1)) mineNumber++;
	        
	        return mineNumber;
	        
	    }
	    
        //Method to find out the existence of mine and to prevent error
	    public boolean mineExist(int x, int y) {
	    	
	        if(x < 0 || x >= xCoordinate || y < 0 || y >= yCoordinate) {
	        	
	            return false;
	            
	        }
	        
	        else {
	        	
	            return (mineSweep[x][y] == "M");
	            
	        }

	    }
	    
	    //Method to print MineSweeper
	    public void printGame() {
	    	
	        for(int a = 0; a < xCoordinate; a++) {
	        	
	            for(int b = 0; b < yCoordinate; b++) {
	            	
	                System.out.print(mineSweep[a][b] + "  ");
	                
	            }
	            
	            System.out.println();
	            
	        }
	        
	    }

	}