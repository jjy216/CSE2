////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab03-BigMac
//02.06.2015
//CSE-002
//Cost of buying a some Big Macs.  It uses the Scanner class to obtain from the user how many Big Macs, the cost per Big Mac, and the percentage tax (which depends on the state; 6% in PA, 8% in MA, etc).

import java.util.Scanner; //importing to use the Scanner class
public class BigMac { // main method to use Java Program
    public static void main (String[] args) {
        
        //Scanner (asking user something)
        Scanner myScanner; //declare an instance of the Scnaner object (ask a question too user)
        myScanner = new Scanner ( System.in ); //call the Scanner constructor, create an instane that will take input from STDIN.
        
        //Input
        System.out.print(
            "Enter the number of Big Macs (an integer > 0): "); //asking number of Big Macs
            int nBigMacs = myScanner.nextInt(); //store the number of BigMacs as an input using integer (Int)
        System.out.print(
            "Enter the cost of per Big Mac as"+ " a double (in the form xx.xx): "); // asking cost of each Big Mac
            double bigMac$ = myScanner.nextDouble(); //store the cost of each BigMacs as an input using decimal (double)
        System.out.print(
            "Enter the percent tax as a whole number (xx): "); //askiing tax percent of each BigMac
            double taxRate = myScanner.nextDouble(); //store the tax rate of each BigMac using decimal (double)
            taxRate/=100; //user enters percent, but I want proportion
        
        //Output
        double cost$;
        int dollars, dimes, pennies; //whole dollar amount of cost for storing digits to the right of the decimal point for the cost$
        cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping decimal fraction
        dollars=(int)cost$; 
        dimes=(int)(cost$*10)%10; //get amount of dimes e.g (int)(6.73*10)%10 = 67%10 = 7. The % gives you the remainder after the division e.g. 583 % 100 = 83, 27 % 5 = 2.
        pennies=(int)(cost$*100)%10;
        System.out.println(
            "The total cost of " +nBigMacs +" BigMacs, at $"+bigMac$ +" per BigMac, with a" +" sales tax of "+ (int)(taxRate*100) + "%, is $"+dollars+'.'+dimes+pennies+".");
        //Final Output
        
    } //end of main method
} // end of program
    