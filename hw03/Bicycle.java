//////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW-03 Bicycle
//02.10.2015
//

import java.util.Scanner; //importing to use the scanner class
public class Bicycle { //main method to use Java Program
    public static void main(String[] args) {
        
        //Scanner (asking user something)
        Scanner myScanner; //declare an instance of the Scanner object (ask a question to user)
        myScanner = new Scanner( System.in ); //call the Scanner constructor, create an instance that will take input from STDIN.
        
        //input
        Double DiameterWheel = 27.0000; //Diameter of a Wheel in inches
        DiameterWheel /= 63360; //convert to miles
        Double PI = 3.141592; //value of PI
        
        System.out.print("Enter the number of seconds: ");
        Double Seconds = myScanner.nextDouble(); //store the number of seconds
        System.out.print("Enter the number of counts: ");
        Double Counts = myScanner.nextDouble(); //store the number of counts
        Double Distance = Counts*PI*DiameterWheel; //calculate the distance
        
        
        Double Minutes = Seconds/60; //Convert  Second to hours
        Double Hours = Minutes/60;
        Double MilesperHour = Distance/Hours; //Calculating MPH
        MilesperHour = ((int)(MilesperHour*100))/100.0; //make it to 2 decimal points
        Distance = ((int)(Distance*100))/100.0; //make it to 2 decimal points
        
        //output
        System.out.println("The distance was "+Distance+" miles and took "+Minutes+" minutes. ");
        System.out.println("The average mph was "+MilesperHour+".");
    
    } //end of main method
} //end of program