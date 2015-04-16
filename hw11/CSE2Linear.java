////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Hw11-CSE2Linear
//04.14.2015
//CSE-002
//This program will prompt the user to enter 15 integers for students' final grades. Print as array. 
//Next, prompt the user to enter a grade to be searched for. Print out number of iterations used.

import java.util.Scanner; //import scanner
import java.util.Random; //import random numbers

public class CSE2Linear { //class start
    public static void main(String[] args) { //main method
        int[] grades = new int[15]; //form 15 grades in an array
        
        
        //get first set of array
        System.out.println("Enter 15 ints for final grades in CSE2: "); //Prompt user to give 15 integer grades
        Scanner ms = new Scanner(System.in); //call in scanner ms
        
        grades[0] = getInput(0); //get first input digit because it was hard to compare the first number because there is no number before first number, call in method getInput
        int index = 1; //start starts as 1
        while(index < grades.length) { //until the index of the grade array = length of the grade array
            grades[index] = getInput(grades[index - 1]); //copy from method getInput
            index++; //index increases by 1
        } //end of while
        
        
        //sorted grades
        System.out.print("The grades, sorted, are: "); //show the user sorted grades
        gradeArray(grades); //call in method gradeArray
        
        
        //search
        System.out.print("Enter a grade to search for: ");  //prompt the user what grade to search for
        int gradeSearch = num(); //call in method num and save as gradeSearch.
        binary(gradeSearch, grades); //call in binary method
        
        
        //scrambled grades
        grades = scrambled(grades); //call in method scrambled and save as grades
        System.out.println("Scrambled:"); //show the user the scrambled grades
        gradeArray(grades); //call in method gradeArray
        
        
        //search
        System.out.print("Enter a grade to search for: "); //Prompt the user what grade to search for
        gradeSearch = num(); //call in method num and save as gradeSearch
        
        
        //linear
        linear(grades, gradeSearch); //call in method linear
    }
    
    
    
    public static int getInput(int element) { //method getInput with element
        Scanner a = new Scanner(System.in); //call in scanner a
        int temp = a.nextInt(); //temp = input
        if (element > temp) { //if element is bigger than temp
            System.out.println("Input grades must be in increasing order. Enter again: "); //inputs must be in increasing order
            getInput(element); //prompt again
        } //end if
        
        else if (temp < 0 || temp > 100) { //if input is less than 0 or bigger than 100, 
            System.out.println("Input grades must be in range from 0-100. Enter again: "); //input must be in 0-100.
            getInput(element); //prompt again
        } //end else if
        
        return temp; //give temp
    } //end getInput
    
    
    public static void gradeArray(int[] grades) { //void method gradeArray with grades
        System.out.print(grades[0]); //print out the first number of the 15 array numbers
        for(int ind = 1; ind < grades.length; ind++) { //from ind = 1 ~ length of the array gray, increase ind by 1
            System.out.print(" " + grades[ind]); //give grades
        } //end for
        
        System.out.println();
    }//end method gradeArray
    
    
    public static int num() { //method num
        Scanner mss = new Scanner(System.in); //call in mss Scanner
        while(true) { //infinite loop
            if(mss.hasNextInt()) { //if integer
                int number = mss.nextInt(); //save as number
                return number; //give number
            } //end if
            else { //didnt enter an integer
                System.out.print("Enter an integer value: ");
                mss.next();
            } //end else
        } //end while
    } //end method num
    
    public static void binary(int numb, int[] grades) { //method binary searching for number by increasing and decreasing the position number by 1 and finiding it
        int left = 0; //start of the lowest position of array
        int right = grades.length-1; //right position of the half
        int mid = (left + right) / 2; //middle of the array
        
        int match = 0; 
        int iterations=0;
        
        while (true) { //infinite loop
            iterations++;
            
            if (grades[mid] != numb) { 
                if(grades[mid] > numb) {
                    right = mid - 1; //change the right of position mid -1
                } //end if
                
                else {
                    left = mid + 1; //change the left of position mid +1 
                } //end else
                
                match = mid; //match = mid
                mid = (left + right) / 2;
                if (match == mid) { //when match = mid 
                    System.out.println(numb + " was not found in the list with " + mid + " iterations"); //didnt find the number
                    break;
                } //end if
            } //end if
            else {
            System.out.println(numb + " was found in the list with " + iterations+" iterations"); //found the number
                break;
            } //end else
        } // end while
    } //end method binary
    
    public static int[] scrambled(int[] grades) {
        
        
        Random r = new Random();
        int[] newGrades = new int[grades.length];
        int num;
        num = r.nextInt(15);
        int count;
        
        
        for(int i = 0; i < 15; i++) {
            newGrades[i] = -1;
        }
        
        for (count = 0; count < 15; count++) {
            if(newGrades[num] == -1) {
                newGrades[num] = grades[count];
            }
            else {
                num = r.nextInt(15);
            }
        }
        return newGrades;
    }
    
    public static void linear(int[] grades, int num) {
        int i = 0;
        for (i=0; i < 15; i++) {
            if (grades[i] == num) {
                break;
            }
        }
        i++;
        if (i == 16) {
            System.out.println(num + " was not found.");
        }
        else {
            System.out.println(num + " was found after " + i + " iterations.");
        }
    }
}