/*Write a program to print out all Armstrong numbers between 1 and 500. 
 * If sum of cubes of each digit of the number is equal to the number itself, 
 * then the number is called an Armstrong number.
 * For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
 */

package assignment2;
public class Question5 {

	public static void main(String[] args) {
		int rem, sum, num;
		
		for(int i=1; i<=500; i++)
		{
			sum=0;
			num=i;
			while(num!=0)
			{
				rem = num%10;
				num = num/10;
				sum= sum+ rem*rem*rem;
			}
			if (sum == i) System.out.println(i);
		}
	}
}