////////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW05-ToHex
//02.24.2015
//CSE-002
//This program takes input decimal RGB values and outputs the hex value

import java.util.Scanner; //import scanner class
 
public class ToHex { //class
    public static void main(String[] args) { //main method for java
       
        Scanner myScanner  = new Scanner(System.in); //create scanner
       
        int dec = 0,r,g,b; //create all input variables
        int convert; //conversion variable
        String hex = ""; //output string
       
        System.out.print("Input the R value: "); //ask
         
        if(myScanner.hasNextInt()) { //check if they put an int
            dec = myScanner.nextInt(); //assign to scanner
            if (dec > 255) { //is the number less than 255?
                System.out.println("Sorry, you must enter values between 0-255."); 
            }
            else { // dec is less than 255
               
                convert = dec/16; //get first hexadecimal digit
                switch (convert) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + convert;
                }
               
                 convert = dec%16; //get second hexadecimal digit
                switch (convert) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + convert;
                }
                r = dec; //save whatever value they input
                System.out.print("Input the G value: "); //Enter the G value
               
                if(myScanner.hasNextInt()) {
                    dec = myScanner.nextInt();
                    if(dec > 255) {
                        System.out.println("Sorry, you must enter values between 0-255.");
                    }
                    else {
                       
                       convert = dec/16;
                switch (convert) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + convert;
                }
               
                 convert = dec%16;
                switch (convert) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + convert;
                }
                      g = dec;
                       
                       System.out.print("Input the B value: ");
                       if(myScanner.hasNextInt()) {
                           dec = myScanner.nextInt();
                           if(dec > 255) {
                               System.out.println("Sorry, you must enter values between 0-255.");
                           }
                           else {
                               
                               convert = dec/16;
                switch (convert) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + convert;
                }
               
                 convert = dec%16;
                switch (convert) {
                    case 10:
                        hex = hex + "A";
                        break;
                    case 11:
                        hex = hex + "B";
                        break;
                    case 12:
                        hex = hex + "C";
                        break;
                    case 13:
                        hex = hex + "D";
                        break;
                    case 14:
                        hex = hex + "E";
                        break;
                    case 15:
                        hex = hex + "F";
                        break;
                    default:
                        hex = hex + convert;
                }
                               b = dec;
                               System.out.println("The decimal numbers R:" + r + ", G:"+ g +", B:"+ b +", is represented in hexadecimal as: " + hex); //finally output
                           }
                       }
                       else {
                           System.out.println("Sorry, your input must consist of integers."); //Each of these is error for not entering an int
                       }
                    }
                }
                else {
                    System.out.println("Sorry, your input must consist of integers.");
                }
            }
        }
        else {
            System.out.println("Sorry, your input must consist of integers.");
        }
       
    } //end of main method
} //end of class