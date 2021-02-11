import java.util.Scanner;

class SumDigits
{
/*2.2.2.2.  Create a  program  called SumDigits  that  asks  the  user  to  enter numbers(integer values) until he enters 0. 
 * The program must sum up all the numbers entered bythe user and then show the final result, and how many digits it has. For instance, 
 * if theuser types 12, 20, 60, 33, 99 and 0, then the program must output: "The result is 224,and it has 3 digits".*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int numbers = 0;
		int number;
		
		do
		{
			System.out.println("Enter a number: ");
			number = sc.nextInt();
			numbers += number;
			
		} while(number != 0);
		
		String size = Integer.toString(numbers);
		
		System.out.println("The result is " + numbers + ", and it has " + size.length() + " digits");
	}
}
