import java.util.Scanner;

class GramOunceConverter
{
/*2.2.1.2. Create a program called GramOunceConverter that will be an improved versionof exercise 2.1.6.2. of previous unit. 
 * In this case, the user will type a weight (float), and a  unit  (g  for  grams, o  for  ounces).*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float weight;
		
		System.out.println("Which unit do you use? g for grams, o for ounces");
		String unit = sc.nextLine();
		
		switch(unit)
		{
			
			case "g":
				System.out.println("Enter a weight: ");
				weight = sc.nextFloat();
				
				float ounces = (weight / 28.35f);
		
				System.out.println(weight + " grams" + " = " + ounces + " ounces");
				break;
			
			case "o":
				System.out.println("Enter a weight: ");
				weight = sc.nextFloat();
				
				float grams = (weight * 28.35f);
				
				System.out.println(weight + " ounces" + " = " + grams + " grams");
				break;
			
			default:
				System.out.println("Enter a valit unit!");
		}
	}
}
