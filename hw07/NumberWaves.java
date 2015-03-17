////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Hw07-NumberWaves
//03.17.2015
//CSE-002
//This program will ask to enter an integer between 1 and 30, inclusive, and then prints out displays that depend on the value entered and look like a wave of numbers.


import java.util.Scanner; //import scanner

public class NumberWaves { //main class
    public static void main(String[] args) { //main method
        Scanner myScanner = new Scanner(System.in); //create scanner
        
        //input variable
        int num; //declare
        
        System.out.print("Enter a number between 1 and 30: "); //Enter a number between 1 and 30.
        if(myScanner.hasNextInt()) { 
            num = myScanner.nextInt(); //declare
            
            if (num > 0 && num < 31) { //if the number entered is between 1 and 30.
                loop(num); //for loop
                whileLoop(num); //while loop
                dowhileLoop(num); //do while loop
            }
            else { //if the number entered is not between 1 and 30
                System.out.println("The number entered is not within range.");
            }
        }
        else { //if entered something other than a number or not an integer.
            System.out.println("Invalid input.");
        }
    }
    
    public static void loop(int num) { //a method for int
        for (int i = 1; i <= num; i ++) { //the main counter
            if (i % 2 == 0){ //if i is divisible by 2?
             for (int j = 1; j <= i; j++) { //make more numbers and count
                  for (int k = 1; k <= j; k++) {
                     System.out.print(i); //print the number
                 }
                 System.out.println(); //skip to the next line
              }
            }
            else { //if it is not divisible by 2
               for (int j = i; j >= 1; j--) //make less numbers
                  for (int k = j; k >= 1; k--) {
                     System.out.print(i);
                 }
                 System.out.println();
              } 
            }
        }
    }
    
    public static void whileLoop(int num) { //same as above except WhileLoop
        int i = 1; 
        while (i <= num) { 
            if (i % 2 ==0) {
                int j = 1;
                while (j <= i) {
                    int k = 1;
                    while (k <= j) {
                        System.out.print(i);
                        k++;
                    }
                    System.out.println();
                    j++;
                }
            }
            else {
                int j = i;
                while (j >= 1) {
                    int k = j;
                    while (k >= 1) {
                        System.out.print(i);
                        k--;
                    }
                    System.out.println();
                    j--;
                }
            }
            i++;
        }
    }
    public static void dowhileLoop(int num) { //same as above but doWhileLoop
        int i = 1;
        do { 
            if (i % 2 == 0) {
                int j = 1;
                do {
                    int k = 1;
                    do {
                        System.out.print(i);
                        k++;  
                    } while (k <= j);
                    System.out.println();
                    j++;
                } while (j <= i);
            }
            else {
                int j = i;
                do {
                    int k = j;
                    do {
                        System.out.print(i);
                        k--;  
                    } while (k >= 1);
                    System.out.println();
                    j--;
                } while (j >= 1);
            }
            i++;
        } while (i <= num);
    }
}