/*Write a do-while loop that asks the user to enter two numbers. 
 * The numbers should be added and the sum displayed. 
 * The loop should ask the user whether he or she wishes to perform the operation again. 
 * If so, the loop should repeat; 
 * otherwise it should terminate.
 * (while loop)
 */

package assignment2;
import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int num1;
		int num2;
		int sum;
		char choice;
		do 
		{
			System.out.println("Please enter the two numbers: ");
			num1= s.nextInt();
			num2= s.nextInt();
			sum= num1+num2;
			System.out.println("Sum is "+sum);
			System.out.println("Do you wish to continue: (y/n):  ");
			choice = s.next().charAt(0);
		}while(choice == 'y'|| choice == 'Y');
		System.out.println("Thank you.");
		s.close();
	}

}
