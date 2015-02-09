
//////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW-03 Root
//02.10.2015
//Calculating cube root
//Using Scanner to do this. 

import java.util.Scanner;
//define class
public class Root {
    //main method
    public static void main(String[] args) {
        Scanner RootScanner;
        RootScanner = new Scanner( System.in );//scanner ready
        System.out.print("Enter a double, and I print its cube root- ");
        double x = RootScanner.nextDouble();
        double Guess = x/3;
        double Guess1 = (2*Guess*Guess*Guess+x)/(3*Guess*Guess);
        double Guess2 = (2*Guess1*Guess1*Guess1+x)/(3*Guess1*Guess1);
        double Guess3 = (2*Guess2*Guess2*Guess2+x)/(3*Guess2*Guess2);
        double Guess4 = (2*Guess3*Guess3*Guess3+x)/(3*Guess3*Guess3);
        double Guess5 = (2*Guess4*Guess4*Guess4+x)/(3*Guess4*Guess4);
        System.out.println("The cube root is "+Guess5+":");
        System.out.println(Guess5+"*"+Guess5+"*"+Guess5+"=" + (Guess5*Guess5*Guess5));
    
    }//end of main method
}//end of program