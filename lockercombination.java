/**
 * Name: Mustafa Nafia
 * Instructor: Cindy Tucker
 * Class: CIT 149
 * Purpose: Encryption cipher
 */
import java.util.Scanner;
import java.util.Random;

public class lockercombination {
    public static void main (String [] args) {
        Scanner scnr = new Scanner (System.in);
        Random randGen = new Random();
        //Declaring Variables and assigning constants.
 
        String studentName; 
        String lockerNumber; 
        final int securityKey;
        final int COMBINATION_MAX = 40;
        final int monthlyRate = 11;
        int firstCombinationNumber;
        int secondCombinationNumber; 
        int thirdCombinationNumber; 
        int encryptedCombination1;
        int encryptedCombination2;
        int encryptedCombination3;     
        int encryptedwithModuloWrapAround;
        int encryptedwithModuloWrapAround1;
        int encryptedwithModuloWrapAround2;
        int studentChange;
        int numMonthsRent;
        int studentPaid;
        //Assigning security Key to range between 1 and 500. 
        securityKey = randGen.nextInt(500) + 1;
        // Asking the user to input values for the required variables. 
        System.out.println("please enter your full name");
        studentName = scnr.nextLine();
               
        System.out.println("Choose a locker number");
        lockerNumber = scnr.next();
         
        System.out.println("Enter first combination number");
        firstCombinationNumber = scnr.nextInt();
                
        System.out.println("Enter second combination number");
        secondCombinationNumber = scnr.nextInt(); 
        
        System.out.println("Enter third combination number");
        thirdCombinationNumber = scnr.nextInt(); 
        
        System.out.println("How many months are you renting the locker?");
        numMonthsRent = scnr.nextInt();
        
        System.out.println("How much are you paying? ");
        studentPaid = scnr.nextInt();
        
        //Getting the real Combination.
        encryptedCombination1 = (firstCombinationNumber + securityKey);      
                             
        encryptedCombination2 = (secondCombinationNumber + securityKey);
                              
        encryptedCombination3 = (thirdCombinationNumber + securityKey);
        
  
        // Getting the combination in which the student will use. 
        encryptedwithModuloWrapAround = (encryptedCombination1 % COMBINATION_MAX);
        encryptedwithModuloWrapAround1 = (encryptedCombination2 % COMBINATION_MAX);
        encryptedwithModuloWrapAround2 = (encryptedCombination3 % COMBINATION_MAX);
        
        //printing out the receipt information.
        
        System.out.println("Student name is " + studentName);
        System.out.println("Locker number assigned is " + lockerNumber);
        System.out.println("Locker Combination is " + encryptedwithModuloWrapAround + " " + encryptedwithModuloWrapAround1 + " " 
        + encryptedwithModuloWrapAround2);
        
        System.out.println("Amount of money used " + studentPaid);
        System.out.println("Months rented " + numMonthsRent);
               
        studentChange = (studentPaid - (numMonthsRent * monthlyRate));
        System.out.println("Change given to student: " + studentChange);
    }
}


    

        
        
        
        
        
   

        
 

       
        