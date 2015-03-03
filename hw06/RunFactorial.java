////////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW06-RunFactorial
//03.03.2015
//CSE-002

//use while-loop to solve factorial programs. Using scanner, first input an integer that is between 9 and 16 inclusively. Then calculate the factorial of the input number.  

import java.util.Scanner; //import scanner

public class RunFactorial{ //class
    public static void main(String[] args){ //main method
    
        //variables
        int input;
        int integer;
        int factorial = 1;
        
        //Scanner
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        
        //first input an integer that is between 9 and 16 inclusive.
        do 
        {
            System.out.println("Please enter an integer that is between 9 and 16:");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Invalid input. Enter again!");
                myscanner.next(); 
            }
            input = myscanner.nextInt();
        } while (input > 16 || input < 9);
        
        
        System.out.println("Input accepted: ");
        
        integer = input; //declare
        
        //solve factorial
        while(integer>0)
        {
            factorial *= integer;
            integer--;
        }
        
        System.out.println(input+"! = " + factorial);
    
   
    }//end of method
}//end of class