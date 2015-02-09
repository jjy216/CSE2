//////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW-03 FourDigits
//02.10.2015
//This program will allow to show the first four decimals

import java.util.Scanner; //import the scanner

public class FourDigits { //define class
    public static void main(String[] args) { //main method to use Java Program
        
        //Scanner
        Scanner DigitScanner; //define scanner
        DigitScanner = new Scanner( System.in ); //scanner ready
        
        
        //variable
        int fourdigits;
        
        //input
        System.out.print("Enter a double with four decimal points and I display the four digits to the right of a decimal point- "); //asking for input
        double RandomDouble = DigitScanner.nextDouble(); //store input in scanner
          
        //getting four digits
        RandomDouble *= 10000; //first make it a whole number
        fourdigits = (int)(RandomDouble); //making into an integer and storing as fourdigits
        fourdigits = fourdigits%10000; //dividing by 10000 and getting only the four digits right of the decimal (without zeros)
        String fourdigitsFinal = String.format("%04d",fourdigits); //getting four digits with the zeros
        
        //output
        System.out.println("The four digits are "+fourdigitsFinal+"."); //print out the result
        
    } //end of main method
} //end of program