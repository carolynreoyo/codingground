import java.util.Scanner;
//Author: Carolyn Reoyo
//Date: 12/04/2015
public class BankAccount{
    //Declare and initialize a global variable - current balance to $5000.  
    //This variable is accessible to ALL functions (SCOPE) to update
	//**THIS IS DONE FOR YOU BELOW!**
        public static double curbalance = 5000.00;
        public static Scanner input = new Scanner(System.in);
    
        //Main Function
        public static void main(String []args){
        
        //Declare additional variables
        char purpose;
        
        //Display the welcome message -  (The 'Boss' does NOT need a value returned!)
        //HINT:  The 'Boss' does NOT need a value returned.
        //Call the welecomeMessage() function
        welcomeMessage();
            
        //Prompt the user to enter the account number
        //HINT:  The 'Boss' needs the account number returned!  Assign the call statement to a variable.
        //Call the accountInfo() function
        int account = accountInfo();
        
        //Process menu using a Do-While loop and Switch statement
        //This will Display the menu and Call the Function(s) based on the user's choice until the user enters X 
        do{
            
        //Call the menuSelection function to display the menu and ask the user for their choice 
        //HINT:  The 'Boss' needs the choice returned!  Assign the call statement to a variable.
        //Call the displayMenu() function
        purpose = menuSelection();
            
        //Switch statement is used to determine which function is called based on the user's choice
        //Each case represents the boss calling a function or the helper to perform some task
        switch(purpose){
                
        //Case (If the menu choice is D)
        case 'D':
        deposit(); break;
        
        //Case (If the menu choice is W)
        case 'W':
        withdrawFunds(); break;           
                
        //Case (If the menu choice is B)
        case 'B':
        balance(account); break;
                
        //Case (If the menu choice is X)
        case 'X':
                            
        	System.out.println("Thank you for being a loyal Seminole Bank customer!");break;
                            
        
                
        //This branch is responsible for handling all invalid choices entered by the user                     
        default:
        if (purpose != 'X' && purpose != 'D' && purpose != 'W' && purpose != 'B')      
       //Default for user error handling
        {
        	System.out.println("ERROR: Please enter a D, W, B, or X"); break;}  
        }//end of switch     
             

        }while(purpose != 'X');     
 }//end of main
             
        /**************************************************** FUNCTION DEFINITIONS *****************************************************/
  
        //Display welcome message
        public static void welcomeMessage(){             

        System.out.println("\n***************************************************");
        System.out.println("              Welcome to Seminole Bank!              ");
        System.out.println("\n***************************************************");
             
    	}//end of welcomeMessage
        
    
        //Prompt and Read user account number
        public static int accountInfo (){

        	System.out.print("Please enter your 5-digit Seminole Account Number: ");
        
        int accountInfo = input.nextInt();        
        return accountInfo;
		}//end of accountInfo

        //Display menu choices to the user and Read the users banking choice
        public static char menuSelection (){

			System.out.println("Please choose a transaction. Enter D for deposit, W for withdrawal, B for balance, or X to exit the menu: ");
			
        char purpose = input.next().charAt(0);
        purpose = Character.toUpperCase(purpose); 
        return purpose; 
		}//end of menuSelection
         
        //Prompt the user for the amount to deposit and Read deposit amount
        public static void deposit(){
          
        	System.out.println("Enter the amount of the deposit: ");
        	
        double deposit = input.nextDouble();
        curbalance = curbalance + deposit;
		}//end of deposit
    
    
        //Prompt the user for the amount to withdraw and Read withdrawal amount
        public static void withdrawFunds (){
             
        	System.out.println("Enter the amount of the withdrawal: ");
        	
        double withdrawFunds = input.nextDouble();
        curbalance = curbalance - withdrawFunds;
		}//end of withdrawFunds
     
    
        //Display the current balance
        public static void balance(int accountNum){
             
    		System.out.print("Your account number is " + accountNum);
    		
            System.out.printf(" has a current balance of: $" + "%.2f%n" , curbalance );
             
		}//end of balance
                  
        /**************************************************END OF FUNCTION DEFINITIONS **************************************************/
}//end of BankAccount Class