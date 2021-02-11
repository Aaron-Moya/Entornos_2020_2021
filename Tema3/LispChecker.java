import java.util.Scanner;

class LispChecker
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a lisp instruction: ");
		String instruction = sc.nextLine();
		
		int openPar = 0;
		int closedPar = 0;
		
		for (int i = 0; i < instruction.length(); i++)
		{
			if (instruction.charAt(i) == ('('))
			{
				openPar++;
			}
			else if (instruction.charAt(i).contains(')'))
			{
				closedPar++;
			}
		}
		
		if (openPar == closedPar)
		{
			System.out.println("The program is good!");
		}
		else
		{
			System.out.println("The program is not good...");
		}
	}
}
