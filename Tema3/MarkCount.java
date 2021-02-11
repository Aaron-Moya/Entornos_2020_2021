import java.util.Scanner;

class MarkCount
{
/*asks  the  user  to  enter 10  marks(integers between 0 and 10). The program must output how many marks of each typehave been typed*/

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];
		int mark1 = 0,mark2 = 0,mark3 = 0,mark4 = 0,mark5 = 0,mark6 = 0,mark7 = 0,mark8 = 0,mark9 = 0,mark10 = 0;
		
		System.out.println("Enter 10 numbers from 1 to 10: ");
		
		for (int i = 0; i < numbers.length; i++)
		{
			numbers[i] = sc.nextInt();
			
			switch (numbers[i])
			{
				case 1:
					mark1++; break;
				case 2:
					mark2++; break;
				case 3:
					mark3++; break;
				case 4:
					mark4++; break;
				case 5:
					mark5++; break;
				case 6:
					mark6++; break;
				case 7:
					mark7++; break;
				case 8:
					mark8++; break;
				case 9:
					mark9++; break;
				case 10:
					mark10++; break;
			}
		}
		
		System.out.println("Marks per category: ");
		System.out.println("1: " + mark1 + " marks");
		System.out.println("2: " + mark2 + " marks");
		System.out.println("3: " + mark3 + " marks");
		System.out.println("4: " + mark4 + " marks");
		System.out.println("5: " + mark5 + " marks");
		System.out.println("6: " + mark6 + " marks");
		System.out.println("7: " + mark7 + " marks");
		System.out.println("8: " + mark8 + " marks");
		System.out.println("9: " + mark9 + " marks");
		System.out.println("10: " + mark10 + " marks");
	}
}
