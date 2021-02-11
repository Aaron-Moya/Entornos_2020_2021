import java.util.Scanner;

class SortJoin
{
/*asks the user to enter a list of namesseparated  by  whitespaces. Then, the  program  must split  the  string, sort  the  namesalphabetically 
 * and output them separated by commas*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the names: ");
		String names = sc.nextLine();
		String[] namesParts = names.split(" ");
		
		for (int i = 0; i < namesParts.length - 1; i++)
		{
			for (int j = i; j < namesParts.length; j++)
			{
				if (namesParts[i].compareTo(namesParts[j]) > 0)
				{
					String aux = namesParts[i];
					namesParts[i] = namesParts[j];
					namesParts[j] = aux;
				}
			}
		}
		
		for (int i = 0; i < namesParts.length; i++)
		{
			if (i == namesParts.length - 1)
			{
				System.out.print(namesParts[i]);
			}
			else
			{
				System.out.print(namesParts[i] + ", ");
			}
			
			
		}
	}
}
