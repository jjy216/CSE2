////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab11-ArraySearch
//05.01.2015
//CSE-002

import java.util.Scanner;
import java.util.Random;

public class ArraySearch {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner ms = new Scanner(System.in);
        
        int[] array1 = new int[50];
        int[] array2 = new int[50];
        
        for (int i = 0; i < 50; i++) {
            array1[i] = r.nextInt(101);
            if (i == 0) {
                array2[i] = r.nextInt(101);
            }
            else {
                array2[i] = array2[i-1] + r.nextInt(101);
            }
        }
        
        int min = array1[0];
        int max = array1[0];
        
        for (int i = 1; i < 50; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        
        System.out.println("The maximum output of array1 is: " +max);
        System.out.println("The minumum output of array1 is: " +min);
    
        min = array2[0];
        max = array2[49];
        
        System.out.println("The maximum output of array2 is: " +max);
        System.out.println("The minumum output of array2 is: " +min);
        
        
        System.out.print("Enter an int: ");
        
        if (ms.hasNextInt()) {
            int num = ms.nextInt();
            if (num >= 0) {
                
                int top = 49;
                int bot = 0;
                int index = (top+bot)/2;
                
                while (true) {
                    
                    if (array2[index] > num && array2[index-1] < num) {
                        System.out.println(num + " was not found in the list.");
                        System.out.println("The number above the key was " + array2[index+1]);
                        System.out.println("The number below the key was " + array2[index-1]);
                        break;
                    }
                    
                    else if(array2[index] < num && array2[index + 1] > num) {
                        System.out.println(num + " was not found in the list.");
                        System.out.println("The number above the key was " + array2[index+1]);
                        System.out.println("The number below the key was " + array2[index-1]);
                        break;
                    }
                    
                    else if (array2[index] == num) {
                        System.out.println(num + " was found in the list.");
                        break;
                    }
                    
                    else {
                        if(array2[index] > num) {
                            top = index - 1;
                        }
                        else {
                            bot = index + 1;
                        }
                        index = (top+bot)/2;
                    }
                }
                
            }
        }
   
    }
}