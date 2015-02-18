////////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW04-WhichNumber
//02.17.2015
//CSE-002
//This program will prompt the user to think of an integer between 1 and 10 inclusive. The program prceeds to ask the user questions in an attempt to guess what number the user is thinking of.


//define a class
import java.util.Scanner;

public class WhichNumber{ //main method
    public static void main(String[] args){
    
        //Scanner
        Scanner myScanner;
        //call scanner
        myScanner = new Scanner(System.in);
        
        String number = "x"; //variable
        System.out.println("Think of a number between 1 and 10 inclusive."); 
       
        //Questions
        System.out.println("Is youe number even? ");
        number = myScanner.next(); //even or odd?
        
        if (number.equals("y") || number.equals("Y")) { //when it is even
            System.out.println("Is it divisible by 3? ");
            number = myScanner.next(); //divisible by 3?
            
            if (number.equals("y") || number.equals("Y")) { //when it is divisible by 3
                System.out.println("Is your number 6? ");
                number = myScanner.next(); //Number is 6?
                
                if (number.equals("y") || number.equals("Y")) { //if the number is 6
                    System.out.println("Yay!"); //Number is 6
                }
                
                else if (number.equals("n") || number.equals("N")) { //if the number is not 6
                    System.out.println("That is not consistent."); //user is not consistent.
                }
                
                else { //when it is other than y, Y, n, or N
                    System.out.println("Sorry, that is not a valid input."); //not a valid input
                }
            } // divisible by 3 end
            
            else if (number.equals("n") || number.equals("N")) { //when it is not divisible by 3 
                System.out.println("Is the number divisible by 4? "); //when it is divisible by 4
                number = myScanner.next();
                
                if (number.equals("y") || number.equals("Y")) { //divisible by 4
                    System.out.println("Is the number divided by 4 greater than 1? "); //divisible by 4 greater than 1?
                    number = myScanner.next();
                    
                    if (number.equals("y") || number.equals("Y")) { //divisible by 4 and greater than 1
                        System.out.println("Is your number 8?" ); //Number is 8?
                        number = myScanner.next();
                        
                        if (number.equals("y") || number.equals("Y")) { //if the number is 8
                            System.out.println("Yay!"); //Number is 8.
                        }
                
                        else if (number.equals("n") || number.equals("N")) { //if the number is not 8
                            System.out.println("That is not consistent."); //user is not consistent
                        }
                
                        else { //when it is other than y, Y, n, or N
                            System.out.println("Sorry, that is not a valid input."); //not a valid input.
                        }
                    } //divisible by 4 greater than 1 end.
                    
                    else if (number.equals("n") || number.equals("N")) { //not divisible by 4 greater than 1
                        System.out.println("Is your number 4? "); //Number is 4?
                        number = myScanner.next();
                        
                        if (number.equals("y") || number.equals("Y")) { //if the number is 4
                            System.out.println("Yay!"); //Number is 4
                        }
                        
                        else if (number.equals("n") || number.equals("N")) { //if the number is not 4
                            System.out.println("That is not consistent."); //user is not consistent
                        }
                        
                        else { //when it is other than y, Y, n, or N
                            System.out.println("Sorry, that is not a valid input."); //not a valid input
                        }
                    } //not divisible by 4 greater than 1 end
                } //divisible by 4 end
                    
                else if (number.equals("n") || number.equals("N")) { //not divisible by 4 
                    System.out.println("Is if divisible by 5? "); //Divisible by 5?
                    number = myScanner.next();
                    
                    if (number.equals("y") || number.equals("Y")) { //divisible by 5
                        System.out.println("Is your number 10? "); //Number is 10?
                        number = myScanner.next();
                        
                        if (number.equals("y") || number.equals("Y")) { //if number is 10
                            System.out.println("Yay!"); //number is 10.
                        }
                
                        else if (number.equals("n") || number.equals("N")) { //if number is not 10
                            System.out.println("That is not consistent."); //user is not consistent.
                        }
                
                        else { //when it is other than y, Y, n, or N
                            System.out.println("Sorry, that is not a valid input."); //not a valid input
                        }
                    } //divisible by 5 end
                    
                    else if (number.equals("n") || number.equals("N")) { //not divisible by 5
                        System.out.println("Is your number 2?"); //Number is 2?
                        number = myScanner.next();
                        
                        if (number.equals("y") || number.equals("Y")) { //if number is 2
                            System.out.println("Yay!"); //Number is 2.
                        }
                        
                        else if (number.equals("n") || number.equals("N")) { //if number is not 2
                            System.out.println("That is not consistent.");
                        }
                        
                        else { //when it is other than y, Y, n, or N
                            System.out.println("Sorry, that is not a valid input."); //not a valid input
                        }
                    } //not divisible by 5 end
                } //not divisible by 4 end
            
                else { //when it is other than y, Y, or N
                    System.out.println("Sorry, that is not a valid input.");
                }
            } //not divisible by 3 end
        } //when it is even end.


        
        else if (number.equals("n") || number.equals("N")) { //when it is odd 
            System.out.println("Is it divisible by 3? "); //divisible by 3?
            number = myScanner.next();
            
            if (number.equals("y") || number.equals("Y")) { //divisible by 3
                System.out.println("When dividied by 3 is the result greater than 1? "); //dividend of 3 greater than 1?
                number = myScanner.next();
                
                if (number.equals("y") || number.equals("Y")) { //dividend of 3 greater than 1
                    System.out.println("Is your number 9? "); //number is 9?
                    number = myScanner.next();
    
                    if (number.equals("y") || number.equals("Y")) { //Number is 9.
                        System.out.println("Yay!"); //Number is 9.
                    }
                        
                    else if (number.equals("n") || number.equals("N")) { //Number is not 9.
                        System.out.println("That is not consistent."); //user is not consistent.
                    }
                        
                    else { //when it is other than y, Y, n, or N
                        System.out.println("Sorry, that is not a valid input."); //not a valid input
                    }
                } //dividend of 3 greater than 1 end
                
                else if (number.equals("n") || number.equals("N")) { //dividend of 3 not greater than 1
                    System.out.println("Is your number 3? "); //Number is 3?
                    number = myScanner.next();
                    
                    if (number.equals("y") || number.equals("Y")) { //Number is 3.
                        System.out.println("Yay!"); //Number is 3
                    }
                        
                    else if (number.equals("n") || number.equals("N")) { //Number is not 3
                        System.out.println("That is not consistent."); //user is not consistet
                    }
                        
                    else { //when it is other than y, Y, n, or N
                        System.out.println("Sorry, that is not a valid input."); //not a valid input
                    }
                } //dividend of 3 not greater than 1 end
            } //divisible by 3 end
                
            else if (number.equals("n") || number.equals("N")) { //not divisible by 3
                System.out.println("is it greater than 6? "); //greater than 6?
                number = myScanner.next();
                
                if (number.equals("y") || number.equals("Y")) { //greater than 6.
                    System.out.println("is your number 7? "); //number is 7?
                    number = myScanner.next(); 
                    
                    if (number.equals("y") || number.equals("Y")) { //number is 7.
                        System.out.println("Yay!"); //number is 7.
                    }
                    
                    else if(number.equals("n") || number.equals("N")) { //number is not 7
                        System.out.println("That is not consistent."); //user is not consistent
                    }
                    
                    else { //when it is other than y, Y, n, or N
                        System.out.println("Sorry, that is not a valid input."); //not a valid input
                    }
                } //greater than 6 end
                
                else if (number.equals("n") || number.equals("N")) { //not greater than 6
                    System.out.println("is it less than 3? "); //less than 3?
                    number = myScanner.next();
                    
                    if (number.equals("y") || number.equals("Y")) { //less than 3
                        System.out.println("Is your number 1? "); //number is 1?
                        number = myScanner.next();
                        
                        if (number.equals("y") || number.equals("Y")) { //number is 1
                            System.out.println("Yay!");
                        }
                
                        else if (number.equals("n") || number.equals("N")) { //number is not 1
                            System.out.println("That is not consistent."); //user is not consistent
                        }
                
                        else { //when it is other than y, Y, n, or N
                            System.out.println("Sorry, that is not a valid input."); //not a valid input.
                        }
                    } //less than 3 end
                    
                    else if (number.equals("n") || number.equals("N")) { //not less than 3
                        System.out.println("Is your number 5? "); //number is 5?
                        number = myScanner.next(); 
                        
                        if (number.equals("y") || number.equals("Y")) { //number is 5.
                            System.out.println("Yay!"); //number is 5
                        }
                        
                        else if(number.equals("n") || number.equals("N")) { //number is not 5
                            System.out.println("That is not consistent."); //user is not consistent.
                        }
                        
                        else { //when it is other than y, Y, n, or N
                            System.out.println("Sorry, that is not a valid input."); //not a valid input
                        }
                    } //not less than 3 end
                    
                    else { //when it is other than y, Y, n, or N
                        System.out.println("Sorry, that is not a valid input."); //not a valid input
                    }
                } //not greater than 6 end
            
                else { //when it is other than y, Y, n, or N
                    System.out.println("Sorry, that is not a valid input."); //not a valid input
                }
            } //not divisible by 3 end
            
            else { //when it is other than y, Y, n, or N
                System.out.println("Sorry, that is not a valid input."); //not a valid input
            }
        } //when it is odd end
        
        else { //when it is other than y, Y, n, or N
            System.out.println("Sorry, that is not a valid input."); //not a valid input
        }
        
    }//end of method
}//end of class