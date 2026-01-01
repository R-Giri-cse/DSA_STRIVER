import java.util.Scanner;
public class Q_01_UserInputOutput {
 
     public static void main(String[] args){ 

        // Create a Scanner object to read input from the user
         Scanner sc = new Scanner(System.in);

         // Tell the User to input a number
         System.out.print("Enter A Number : ");

         //Takhin input( Integer_number) from the User
         int num = sc.nextInt();

         //Printing the number as a Output
         System.out.println("You Entered : " + num);

         // Close the scanner to prevent resource leak 
         sc.close();

     }

}
  

