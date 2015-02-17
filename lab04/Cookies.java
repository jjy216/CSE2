////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab04-Cookies
//02.13.2015
//CSE-002

//This program will use Scanner to obtain from users how many cookies they want, how many people are buying for, and at least how many cookies they want each person to get. 
//All inputs must be valid.
//Determine if the number of cookies can be divisible evenly among the people and if there is enough for each person.
//If there are not enough cookies, tell the user how many more cookies are needed.

import java.util.Scanner; //import Scanner.

public class Cookies { //main method required for every Java Program.
    public static void main(String[] args) {
    
    //Scanner
    Scanner myScanner; //declare an instance of the Scnaner object (ask a question too user)
    myScanner = new Scanner (System.in); //call the Scanner constructor, create an instane that will take input from STDIN.
    
    //input (number of people)    
    int nPeople;    
    System.out.print("Enter the number of people: ");
        if(myScanner.hasNextInt()){
            nPeople=myScanner.nextInt();
            if (nPeople<1){
                System.out.println("You did not enter an int > 0.");
            }
        }
        else{
          System.out.println("You did not enter an int.");
          return; //leaves the program, i.e.
        }
        
    //input (number of cookies)
    int nCookies;
    System.out.print("Enter the number of cookies you are planning to buy: ");
        if(myScanner.hasNextInt()){
            nCookies=myScanner.nextInt();
            if (nCookies<1){
                System.out.println("You did not enter an int > 0.");
            }
        }
        else{
            System.out.println("You did not enter an int.");
            return; //leaves the program, i.e.
        }
        
    //input (Cookies per Person)
    int nCookiesPerson;
    System.out.print("How many do you want each person to get? ");
    
        if(myScanner.hasNextInt()){
            nCookiesPerson=myScanner.nextInt();
            if (nCookiesPerson<0){
                System.out.println("You did not enter an int > 0.");
                return;
            }
        }
        
        else{
            System.out.println("You did not enter an int.");
            return; //leaves the program, i.e.
        }
        if (nCookies<(nPeople*nCookiesPerson)){
            System.out.println("You will not have enough cookies. You need to buy at least " + ((nCookiesPerson*nPeople)-nCookies)+" more.");
        }
        else{
            if (nCookies%nPeople == 0){
                System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            }
            else{
                System.out.println("You have enough, but they will not divide evenly.");
            }
        }
        
        
        
        

    } //end of main method
} //end of class