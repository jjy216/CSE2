////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Hw08-HW08
//03.24.2015
//CSE-002
//This program will allow to practice in writing methods, overloading methods, and in forcing the user to enter good input

import java.util.Scanner; //input scanner class
import java.lang.Math; //input math class

public class HW8 { //main class
    public static void main(String[] args) { //main method
        
        char option;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        
        System.out.println("Hero! Have a good day!");
    }
    
     public static void giant() { //picture of giant
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() { //picture of the cave
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){ //picture of boxes 
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner q, String str) { //method to get basic input
        String let = q.next();
        if (!let.equalsIgnoreCase("C")) { //if user input other than c or C, 
            System.out.println("Yea right LOSER!"); 
            System.exit(0); //end the program
        }
        return str;
    } //end basic input method
    
    public static String getInput(Scanner q, String str, int num) { //method for fighting with giant
        String let = "";
        int rand = 0;
        int health = 10; //giant's heath
        int escape = 0;
        
        while (health > 0) { //while giant has more than 0 hp.
            let = q.next(); 
            if(let.equalsIgnoreCase("A")){ //if input is A
                rand = random(); //generate a radom number from 1-100 (attack damage)
                if (rand < 50) { //if attack is under 50
                    System.out.println("Gosh! How can you miss it!"); //user miss
                }
                else { //if attack is 50 or over                
                    System.out.println("CRITICAL HIT!"); //user hit
                    health--; //hp -1
                    System.out.println("Giant Health: " + health); //display giant's health
                }
            }
            else if (let.equalsIgnoreCase("E")) { //if user tries to escape
                rand = random(); //generate random number from 1-100
                if (rand > 90) { //if it's over 90 
                    System.out.println("You escaped Successfully!"); //user escaps
                    System.exit(0); //end program
                }
                else { //if not over 90
                    System.out.println("You have failed to escape."); //failed to escape
                }
            }
            else { //if enter something else
                System.out.println("Executed0 by the GIANT! Game Over!"); //kill the user
                System.exit(0); //end the game
            }
            if(health > 0) { //if hp of giant is over 0
                System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
            }
        }
        return str; //go back
    } //end figh method
    
    public static String getInput(Scanner q) { //method for treasure boxes
        String str = ""; //create input string
        if (q.hasNextInt()) { //integer only
            int num = q.nextInt(); //assign int
            switch (num) { // check against num
                case 1: System.out.println("You got a iron sword! That should help on your next adventure!"); //prize for chest 1
                    break;
                case 2: System.out.println("You found an IOU For a cake! To bad it could be a lie."); //chest 2
                    break;
                case 3: System.out.println("You have found a Penguin! Enojy!"); //chest 3
                    break;
                default:
                    System.out.println("You failed to pick a chest. You get nothing"); //if nothing is picked
            }
        }
        else { //entered something other than an integer
            System.out.println("You failed to pick a chest. You get nothing"); //fail
        }
        return str;
    } //end box method
    
    public static int random() { //simple random number generator
        int num = (int)(Math.random() * 99) + 1; //generates random number from 1-100

        return num; //returns that number
    }

}