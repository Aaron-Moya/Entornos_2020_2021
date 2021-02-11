import java.util.Scanner;

class CalculateDensity
{
	
	public static void main(String[] args)
	{
		CalculateDensity();
	}
	
	public static void CalculateDensity()
	{
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the weigth: ");
			String weight = sc.nextLine();
			int weightInt = Integer.parseInt(weight);
			
			System.out.println("Enter the volume: ");
			String volume = sc.nextLine();
			int volumeInt = Integer.parseInt(volume);
			
			int density = weightInt / volumeInt;
			System.out.println("Density is : " + density);
			
		} catch(NumberFormatException e1)
		{
			System.err.println("Error: " + e1.getMessage());
		} catch(ArithmeticException e2)
		{
			System.err.println("Error: " + e2.getMessage());
		}
	}
}
