////////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW06-GetIntegers
//03.03.2015
//CSE-002

//Ask the user for 5 non-negative integers (if an invalid value is entered, then ask again, using a loop), and print out the sum of the 5 integers


import java.util.Scanner; //import Scanner

public class GetIntegers{ //class
    
    public static void main(String[] args){ //main method
        
        Scanner myscanner;
        myscanner = new Scanner(System.in);
        
        //variables
        int integer = 0;
        int sum = 0;
        
        System.out.println("Please enter 5 non-negative integers: ");
        
        //for loop
        for (int i = 0; i < 5; i++)
        {
            while (!myscanner.hasNextInt()) //integer
            {
                System.out.println("Invalid input, enter again");
                myscanner.next(); 
            }
            integer = myscanner.nextInt();
            
            while(integer<0) //positive number
            { 
                System.out.println("Invalid input, enter again");
                integer = myscanner.nextInt();
            }
            //sum
            sum += integer;
            
        }
        //print out
        System.out.println("Sum is " + sum);
        
    }//end of method
}//end of class
        
        