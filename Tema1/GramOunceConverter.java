import java.util.Scanner;

class GramOunceConverter
{
/*2.1.6.2. Create a program called GramOunceConverter  that  converts  from  grams  to ounces. 
 * The program will ask the user to enter a weight in grams (an integer number),and then it will show the corresponding weight in ounces (a real number), 
 * taking into account that 1 ounce = 28.3495 grams*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a weight: ");
		float grams = sc.nextFloat();
		float ounces = (grams / 28.35f);
		
		System.out.println(grams + " grams" + " = " + ounces + " ounces");
	}
}
