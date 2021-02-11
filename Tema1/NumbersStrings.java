import  java.util.Scanner;

class NumbersStrings
{
/*2.1.6.3. Create a program called NumbersStrings. This program must ask the user toenter 4 numbers, that will be stored in 4 String variables. 
 * Then, the program will join the first pair of numbers into a single integer value, and the second pair of numbers intoanother integer value, 
 * and then add these values. For instance, if the user types thenumbers 23, 11, 45 and 112, then the program will create 
 * a first integer value of 2311 and a second integer value of 45112. Then, it will add these two values and get a finalresult of 47423*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String num1, num2, num3, num4;
		
		System.out.println("Enter 4 numbers: ");
		num1 = sc.nextLine();
		num2 = sc.nextLine();
		num3 = sc.nextLine();
		num4 = sc.nextLine();

		int firstPair = Integer.parseInt(num1 + num2);
		int secondPair = Integer.parseInt(num3 + num4);
		
		System.out.println("Result: " + (firstPair + secondPair));
	}
}
