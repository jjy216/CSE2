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
        } //end for
        return numTEN; //returns numTEN
    } //end of randomInput method
    
    public static int[] delete(int list[], int pos) { //array method for list and pos. deleting an index.
        int length=list.length - 1; //length is equal to length of list - 1
        int numIndex[]= new int[length]; //new set of array with new length of array
        int counter = 0; //create counter
        
        if (pos > 9 || pos < 0) { //if index is greater than 9 or less than 0.
            System.out.println("The index is not valid."); //not a valid index
            return list; //give the original array back.
        } //end of if statement
        
        else { //if index is within range
            System.out.println("Index "+pos+" element was removed"); //remove the index
        } //end else
        
        for (int i = 0; i < length; i++) { //for i is 0~length, increase i by 1 each time
            if(i == pos) { 
                continue; //continue
            } //end if
            
            else {
                numIndex[counter]=list[i]; //copy
                counter++; //increase counter by 1
            } //end else
        } //end for loop
        return numIndex;
    } //end of delete method
  
    public static int[] remove(int list[],int target){ //array method for list and target. Removing a target.
        int counter=0; //create counter for counting how many targets there are
        
        for (int i = 0; i < list.length; i++) { //for i is 0~list.length, increase i by 1 each time.
            if (list[i] == target) { //if the target matches list[i]
                 counter++; //increase counter by 1
            } //end of if
        } //end of for loop
      
        if (counter == 0) { //if there are 0
            System.out.println("Element "+target+" was not found"); //Invalid
            return list; //give back the original
        } //end of if
        
        else{
            System.out.println("Element "+target+" has been found -"+counter+")");
        } //end of else
        
        int numTarget[]= new int[list.length - counter];
        int index=0;
        
        for(int i = 0; i < list.length; i++){
            if(list[i] == target){ //if list = target
                continue; //continue
            } //end of if
            
            else{
                numTarget[index]=list[i];
                index++;
            } //end of else
        } //end of for
         return numTarget; //return the new array after target is removed
    } //end of remove method 
} //end of class