////////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW04-Banking
//02.17.2015
//CSE-002
//a program using switch statements that allows users to process banking transactions.

import java.util.Scanner;
import java.util.Random;

public class Banking{
    
    //add main method
    public static void main(String[] args){
        
        //variable
        int money = 0;
        int deposit = 0;
        int withdraw = 0;
        String choice;
        
        //5000 is the maximum and the 1000 is our minimum
        Random rand = new Random();
        money = rand.nextInt(5000) + 1000; 
        
        //declare scnner
        Scanner myScanner;
        //call scanner
        myScanner = new Scanner(System.in);
        
        //ask questions
        System.out.println("D for Deposit, W for Withdraw, V for View Balance");
        choice = myScanner.next();
        
        switch(choice) { //offering a choice
            
            case "D" : { //deposit
                System.out.println("How much do you want deposit? ");
                deposit = myScanner.nextInt();
                if (deposit <= 0) {
                     System.out.println("Deposit should be a positive number.");
                }
                else if (deposit > 0) {
                    money = money+deposit;
                    System.out.println("Your resulting balance is $" + money +".");
                }
                else {
                    System.out.println("Invalid input.");
                }
                break;
            } //end of deposit
                
            case ("W") : { //withdraw
                System.out.println("How much you want withdraw? ");
                withdraw = myScanner.nextInt();
                if (withdraw <= 0) {
                     System.out.println("Withdrawing amount should be a positive number.");
                }
                else if(withdraw > 0 && withdraw < money) {
                    money = money-withdraw;
                    System.out.println("Your resulting balance is $" + money + ".");
                }
                else if(withdraw < money) {
                     System.out.println("Your balance is not enough to withdraw.");
                }
                else {
                    System.out.println("Invalid input.");
                }
                break;
            } //end of withdraw
            
            case "V" : { //view balance
                System.out.println("Your balance is $" + money +".");
                break;
            } //end of view balance
            
            default : {
                System.out.println("Invalid input");
                break;
            } //end of default
        } //end of switch
        

    }//end of method
}//end of class
