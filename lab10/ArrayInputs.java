import java.util.Scanner;

public class ArrayInputs {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        
        System.out.print("Please enter an integer for the size of an array: ");
        int num =   inputCheck(ms);
        
        int[] A = new int[num];
        System.out.print("Please enter " + num + " positive integer(s): ");
        
        for (int i = 0; i < num; i++) {
            A[i] = inputCheck(ms);
        }
        
        System.out.println("The array is: ");
        System.out.print("[ ");
        for(int i = 0; i < num; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("]");
        System.out.println();
        
    }
    
    public static int inputCheck(Scanner ms) {
        int num = 0;
        
        while(true) {
            if (ms.hasNextInt()) {
                num = ms.nextInt();
                if (num > 0) {
                    break;
                }
                else {
                    System.out.println("Sorry, the number you entered is negative. ");
                    System.out.print("Please enter a positive integer: ");
                }
            }
            else {
                System.out.println("Sorry, the number you entered is negative. ");
                System.out.print("Please enter a positive integer: ");
                ms.next();
            }
        }
        return num;
    }
}