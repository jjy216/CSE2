////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab07-zigzag
//03.13.2015
//CSE-002



import java.util.Scanner;
import java.util.Random;


//define a class
public class zigzag{
    

    public static void main(String[] args){

 
    Scanner myscanner;
    myscanner = new Scanner(System.in);
    
    //variable
    int nStar = 10;
    String a = "";
    
   do
   {
    
    do 
        {
            System.out.println("Please enter an integer that is between 3 and 33:");
            while (!myscanner.hasNextInt()) 
            {
                System.out.println("Only Integer is accepted");
                myscanner.next(); 
            }
            nStar = myscanner.nextInt();
        } while (nStar > 33 || nStar < 3);

    for(int i=0; i < nStar; i++)
    {
        System.out.print('*');
    }
    
    System.out.println("");
   
    for(int i=1; i < nStar-1; i++)
    {
        for(int k = 0; k < i; k++)
        {
            System.out.print(" ");
        }
        System.out.print('*');
        System.out.println("");
    }
    
   
    for(int i=0; i < nStar; i++)
    {
        System.out.print('*');
    }
    
    
    
   
    System.out.println("");
    System.out.println("Enter y or Y to go again");
    a = myscanner.next();
    
    }while(a.equals("y") ||a.equals("Y"));
    
    
    }
}