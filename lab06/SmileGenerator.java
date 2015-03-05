////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab06-SmileGenerator
//03.05.2015
//CSE-002

//The purpose of this lab is to get familiar with loops, a critical piece of syntax that is essential for many programming languages.

import java.util.Scanner;
import java.util.Random;

public class SmileGenerator{ //class
    
    public static void main(String[] args){ //main method for java
    
        
        //output
        System.out.println(":) :) :) :) :)");
        System.out.println("");
        
        int i;
        
        //loop
        String a = ":)";
        for(i=0; i<5; i++)
        {
            System.out.print(a + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        int w = 0;
        
        //using while loop
        while(w<5)
        {
            System.out.print(a + " ");
            w++;
        }
        
        System.out.println("");
        System.out.println("");
        
        //doing while
        int dw = 0;
        
        do{
            System.out.print(a+ " ");
            dw++;
        }while(dw<5);
        
        System.out.println("");
        System.out.println("");
    
        int slr = (int)(Math.random()*100+1); //a random number of smiley faces using “math.random()”.
        
        //second loop
        for(int sl = 0; sl < slr ; sl++)
        {
            System.out.print(a + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        //third loop
        for(int tl = 0; tl < slr; tl++)
        {
            System.out.print(a + " ");
            if(tl==29 || tl ==60 || tl==90)
            {
            System.out.println("");
            }
        }
        
        System.out.println("");
        System.out.println("");
        
        //Fourth loop
        for(int fl = 1; fl < 5; fl++)
        {
            for(int fl2 = 0; fl2 < fl; fl2++)
            {
            System.out.print(a);
            }
            
            System.out.println("");
            
        }
    }//end of method
}//end ot class