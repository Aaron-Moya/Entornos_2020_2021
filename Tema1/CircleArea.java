import java.util.Scanner;

class CircleArea
{
/*2.1.6.4. Create a program called CircleArea that defines a float constant called PIwith the value 3.14159. 
 * hen, the program will ask the user to enter the radius of acircle, and it will output the area of the circle (PI * radius * radius). 
 * This area will beprinted with two decimal digits*/
 
	public static final float PI = 3.14159f;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the radius: ");
		float radius = sc.nextFloat();
		
		float result = PI * radius * radius;
		System.out.println("Result: " + result);
	}
}
