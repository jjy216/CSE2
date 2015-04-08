////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Hw10-RemoveElements
//04.07.2015
//CSE-002
//This program allows practice in manipulating arrays and in writing methods that have array parameters.

import java.util.Scanner; //Scanner
import java.util.Random; //Random number

public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
	        String answer="";
	        do{
  	        System.out.print("Random input 10 ints [0-9]");
  	        num = randomInput();
  	        String out = ". The original array is:";
  	        out += listArray(num);
  	        System.out.println(out);
 
          	System.out.print("Enter the index ");
        	index = scan.nextInt();
          	newArray1 = delete(num,index);
          	String out1="The output array is ";
          	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
         	System.out.println(out1);
 
            System.out.print("Enter the target value ");
          	target = scan.nextInt();
          	newArray2 = remove(num,target);
          	String out2=". The output array is ";
          	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
          	System.out.println(out2);
  	 
          	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
          	answer=scan.next();
        	}while(answer.equals("Y") || answer.equals("y"));
          }

    public static String listArray(int num[]){
        String out="{";
        for(int j=0;j<num.length;j++){
            if(j>0){
            out+=", ";
          }
          out+=num[j];
        }
        out+="} ";
        return out;
    }

    //randomInput method
    public static int[] randomInput() { //generate an array of 10 random integers between 0 to 9.
        Random rand = new Random(); //create new Random
        int[] numTEN = new int[10]; //creates new array of 10 random integers
        
        for (int i = 0; i < 10; i++) { //for i = 0~9 increase i by 1 each time
            numTEN[i] = rand.nextInt(10); //input random number
        }
        return numTEN; //returns numTEN
    }
    
    //delete method
    public static int[] delete(int[] numTEN, int a) { //array method with an input array and index value. Index value = a
        
        if (a >= 0 && a < 10) { //if a is 0~9
            int[] numNINE = new int[9]; //create a new array with 10-1= 9 random integers
            for(int i = 0; i < 10; i++) { //for i = 0~9 increase i by 1 each time
                if(i < a) { //if i < a
                    numNINE[i] = numTEN[i]; //copying
                }
                else if(i == a) { 
                    
                }
                else {
                    numNINE[i-1] = numTEN[i];
                }
            }
            return numNINE; //return new array
        }
        else { //if a is not 0~9
            System.out.println("Index is not valid."); //not a valid index
            return numTEN; //return the old set of 10 number arrays
        }
    }
    
    //remove method
    public static int[] remove(int[] num, int x) { //array method with input array and target value x
        int count = 0; //create a counter so we can match the target value
        for(int i = 0; i < 10; i++) { //for i is 0~9, increase i by one each time
            if(num[i] == x) { //if they are equal
                count++; //add one to the counter
            }
        }
        
        if(count == 0) { //if count was not matched
            System.out.print("Element " + x + " was not found"); //target value was not found
        }
        else { //if count was matched
            System.out.print("Element " + x + " has been found"); //target value was found and removed
        }
        
        int[] numNEW = new int[10-count]; //create a new array that is now set of 10 - matched counts
        int z = 0; //create another counter
        
        for(int i = 0; i < 10; i++) { //for i is 0~9, increase i by 1.
            if (num[i] != x) { //if original array does not equal to the target
                numNEW[i-z] = num[i]; //copying
            }
            else { //if origial array equal the target
                z++; //if it is, then add one to the counter
            }
        }
        return numNEW; //return the new array
    }
}