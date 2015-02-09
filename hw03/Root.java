
//////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW-03 Root
//02.10.2015
//Calculating cube root
//Using Scanner to do this. 

import java.util.Scanner; //importing to use Scanner

public class Root { //define class
    public static void main(String[] args) { //main method
        
        //Scanner
        Scanner RootScanner; //define scanner 
        RootScanner = new Scanner( System.in ); //scanner ready
        
        System.out.print("Enter a double, and I print its cube root- "); //getting input
        double x = RootScanner.nextDouble(); //store to x
        
        
        double Guess = x/3; //Guessing start
        double Guess1 = (2*Guess*Guess*Guess+x)/(3*Guess*Guess); //improving the estimation 
        double Guess2 = (2*Guess1*Guess1*Guess1+x)/(3*Guess1*Guess1); //improving the estimation 
        double Guess3 = (2*Guess2*Guess2*Guess2+x)/(3*Guess2*Guess2); //improving the estimation 
        double Guess4 = (2*Guess3*Guess3*Guess3+x)/(3*Guess3*Guess3); //improving the estimation 
        double Guess5 = (2*Guess4*Guess4*Guess4+x)/(3*Guess4*Guess4); //improving the estimation 
        
        //output (print out result)
        System.out.println("The cube root is "+Guess5+":");
        System.out.println(Guess5+"*"+Guess5+"*"+Guess5+"=" + (Guess5*Guess5*Guess5));
    
    } //end of main method
} //end of program