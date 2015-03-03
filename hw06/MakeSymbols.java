////////////////////////////////////////////////////////////////////////////
//Jason Yang
//HW06-MakeSymbols
//03.03.2015
//CSE-002

//For this program, use do-while loops and the random number generator to generate an integer between 0 and 100. Print out the number. If the number is even, print out that number of “*” characters; if the number is odd, print out that number of “&” characters

public class MakeSymbols{ //class
        public static void main(String[] args){ //main method
            
            int random;
            int count;
        
            random = (int)(Math.random()*101); //integer between 0~100.
            
            System.out.println("Random number generated : " + random);
            
            count = random;
            
            //if the number is even, it will print out as *
            if(random%2 == 0)
            {
                do{
                    System.out.print("*");
                    count--;
                }while(count>0);
            }
            
            //if the number is odd, it print out that number as "&"
            if(random%2 == 1)
            {
                do{
                    System.out.print("$");
                    count--;
                }while(count>0);
            }
            
        }//end of method
}//end of class
    