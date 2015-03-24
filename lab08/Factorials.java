////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Lab08-Factorials
//03.20.2015
//CSE-002

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number you want to find the super factorial of: ");
        if (scan.hasNextInt()) {
            int sup = scan.nextInt();
            if (sup > 0) {
                int sum = 0;
                for(int i = 1; i <= sup; i++){
                  sum += factorial(i);
                }
                print(sum, sup);
            }
            else {
                System.out.println("Input is invalid.");
            }
        }
        else {
            System.out.println("Input is invalid.");
        }
  }
    public static int factorial(int key){
        int mul = 1;
        for (int i = 1; i <= key; i++){
            mul *= i;
        }
        return mul;
    }
    public static void print(int num, int star){
        System.out.println("The super factorial of " + star + " is equal to " + num);
    }
}