////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab09-Sentences
//05.01.2015
//CSE-002

import java.util.Random;
import java.util.Scanner;

public class Sentences {
    public static void main(String[] args) {
        String yes = "y";
        Scanner ms = new Scanner(System.in);
        
        while (yes.equalsIgnoreCase("y")) {
            System.out.println("The " + adj(Random()) + " " + adj(Random()) + " " + sub(Random()) + " " +
                v(Random()) + " the " + adj(Random()) + " " + obj(Random()) + ".");
            
            System.out.println("Enter y to make an another random sentence. Press any other key to exit: ");
            yes = ms.next();
        }
    }
    
    public static String adj(int input) {
        String adjective = "";
        switch (input) {
            case 0: adjective = "sexy";
                break;
            case 1: adjective = "mean";
                break;
            case 2: adjective = "old";
                break;
            case 3: adjective = "loud";
                break;
            case 4: adjective = "fabulous";
                break;
            case 5: adjective = "boastful";
                break;
            case 6: adjective = "shiny";
                break;
            case 7: adjective = "scary";
                break;
            case 8: adjective = "brave";
                break;
            case 9: adjective = "nasty";
                break;
        }
        return adjective;
    }
    
    public static String sub(int input) {
        String subject = "";
        switch (input) {
            case 0: subject = "professor";
                break;
            case 1: subject = "student";
                break;
            case 2: subject = "elderly";
                break;
            case 3: subject = "computer";
                break;
            case 4: subject = "neighbor";
                break;
            case 5: subject = "boxer";
                break;
            case 6: subject = "gold";
                break;
            case 7: subject = "bomb";
                break;
            case 8: subject = "police";
                break;
            case 9: subject = "cigarette";
                break;
        }
        return subject; 
    }
    
    public static String v(int input) {
        String verb = "";
        switch (input) {
            case 0: verb = "taught";
                break;
            case 1: verb = "studied";
                break;
            case 2: verb = "felt";
                break;
            case 3: verb = "displayed";
                break;
            case 4: verb = "donated";
                break;
            case 5: verb = "fought";
                break;
            case 6: verb = "gave";
                break;
            case 7: verb = "took down";
                break;
            case 8: verb = "caught";
                break;
            case 9: verb = "caused";
                break;
        }
        return verb;
    }
    public static String obj(int input) {
        String object = "";
        switch (input) {
            case 0: object = "computer science";
                break;
            case 1: object = "textbook";
                break;
            case 2: object = "uneasiness";
                break;
            case 3: object = "picture";
                break;
            case 4: object = "money";
                break;
            case 5: object = "enemy";
                break;
            case 6: object = "wealth";
                break;
            case 7: object = "building";
                break;
            case 8: object = "robber";
                break;
            case 9: object = "cancer";
                break;
        }
        return object;
    }
    public static int Random() {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(10);
        return randomInt;
    }
}