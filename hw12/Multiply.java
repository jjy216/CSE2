////////////////////////////////////////////////////////////////////////////
//Jason Yang
//Hw12-Multiply
//04.23.2015
//CSE-002
//This program gives practice in manipulating multidimensional arrays, and in writing methods that have array parameters.

import java.util.Scanner; //import scanner 
import java.util.Random; //import random numbers

public class Multiply { //main class
    public static void main(String[] args) { //main method 
        
        int[][] matrixA; //define MatrixA
        int[][] matrixB; //define MatrixB
        int[][] product; //define product
        int w = 0; //define width
        int h = 0; //define height
        
        Scanner ms = new Scanner(System.in); //call in Scanner
        
        //width
        System.out.print("Enter a positive integer for the width of the matrix: "); 
        while (true) { //infinite loop
            w = getInput(ms); //call in getInput method
            if (w < 0 || w == 0) { //check for positive integer
                System.out.print("Not a positive integer. Enter again: "); 
            } //if end
            else {
                break; //break from loop
            } //else end
        } //while end
        
        //height
        System.out.print("Enter a positive integer for the height of the matrix: ");
        while (true) { 
            h = getInput(ms); //call in getInput method
            if (h < 0 || h == 0) {
                System.out.print("Not a positive integer. Enter again: "); 
            } //if end
            else {
                break; //break from loop
            } //else end
        } //while end
        
        //MatrixA
        matrixA = new int[w][h]; //set dimension
        matrixA = randomMatrix(w, h); //call in randomMatrix method
        System.out.println("Matrix A: ");
        printMatrix(matrixA); //call in printMatrix method
        System.out.println();
        
        //MatrixB
        matrixB = new int[h][w]; //set dimension
        matrixB = randomMatrix(h, w); //call in randomMatrix method
        System.out.println("Matrix B: ");
        printMatrix(matrixB);//call in printMatrix method
        System.out.println();
        
        //Product
        product = new int[w][h]; //set dimension
        product = matrixMultiply(matrixA, matrixB); //call in matrixMultiply method
        System.out.println("Product of Matrix A and Matrix B is: ");
        printMatrix(product); //call in printMatrix method
    }
    
    
    //getInput method
    public static int getInput(Scanner ms) {
        while (true) { //infinite loop
            if (ms.hasNextInt()) { //check for integer
                int input=ms.nextInt();
                return input;
            } //if end
            else {
            System.out.print("Enter a Positive integer: ");
            ms.next(); //prompt again
            } //else end
        } //while end    
    } //getInput end
    
    
    //randomMatrix method
    public static int[][] randomMatrix(int w, int h) { 
        Random r = new Random(); //call in random numbers
        
        int[][] matrix = new int[h][w]; //set dimension
        
        //creating random numbers on each position 
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                matrix[i][j] = r.nextInt(21)-10; //-10 ~ 10
            } //for column end
        } //for row end
       return matrix; 
    } //randomMatrix end
    
    
    //printMatrix method
    public static void printMatrix(int[][] matrix) {
        
        //adding space and printing out each number in each space
        for (int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "  "); 
            } //for column end
            System.out.println();
        } //for row end
    } //printMatrix end
    
    
    //matrixMultiply method
    public static int[][] matrixMultiply(int[][] matrixA, int[][] matrixB) { 
        
        int[][] matrixProd = new int[matrixA[0].length][matrixA.length]; //set dimension
        
        for(int i = 0; i < matrixProd.length; i++) {
            for(int j = 0; j < matrixProd[i].length; j++) {
                matrixProd[i][j] = productAB(matrixA, matrixB, i, j); //call in productAB method
            } //for column end
        } //for row end
        return matrixProd;
    } //matrixMultply end
    
    
    //productAB method
    public static int productAB(int[][] matrixA, int[][] matrixB, int row, int column) {
        int matrixFin = 0;
        
        //multiplication
        for(int i = 0; i < matrixA[0].length; i++) {
            matrixFin += (matrixA[row][i] * matrixB[i][column]);
        } //for end
        return matrixFin; 
    } //productAB end
} //public class end