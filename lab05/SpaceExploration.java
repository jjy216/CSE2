////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab05-SpaceExploration
//03.05.2015    
//CSE-002

//a program that outputs a timeline of significant space exploration advances from 2000 - 2010. Use a random number generator to select a year within that decade. Then, output all events in the timeline that have occurred from 2000 up until the year that has been randomly selected (ex. output all events from 2000 to 2004).

import java.util.Scanner;

public class SpaceExploration{ //class
    
    public static void main(String[] args){ //main method for java
        
        //variables
        int year;
        
        year = (int)(Math.random()*11)+2000;
        
        System.out.println("your year is " + year);
        
        if (year == 2000) { //when the year is 2000
             System.out.println("Here is a timeline of space exploration events in" + year);
        }
        else { //when year is other than 2000
             System.out.println("Here is a timeline of space exploration events from " + year + " to 2000");
        }
        
        switch (year) { //each events for each years
            case 2010 :
                System.out.println("2010 : SpaceX sucessfully sends spacecraft to orbit and back");
                
            case 2009 :
                System.out.println("2009 : N/A");
                
            case 2008 :
                System.out.println("2008 : Kepler launched to study deep space");
                
            case 2007 :
                System.out.println("2007 : N/A");
                
            case 2006 :
                System.out.println("2006 : Spacecraft returns with collections from a comet");
                
            case 2005 :
                System.out.println("2005 : Spacecraft collies with comet");
                
            case 2004 :
                System.out.println("2004 : N/A");
                
            case 2003 :
                System.out.println("2003 : Largest infrared telescope released");
                
            case 2002 :
                System.out.println("2002 : N/A");
                
            case 2001 :
                System.out.println("2001 : First spacecraft lands on asteroid");
                
            case 2000 :
                System.out.println("2000 : First spacecraft orbits on asteroid");
                break;
                
            default :
            
            System.out.println("wrong");
            
        }
    
        
    }//end of method
    
}//end of class