import java.util.Scanner;

public class YoSoyTu
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < cases; i++)
		{
			String character = sc.nextLine();
			String relationship = sc.nextLine();
		
			if (character.equals("Luke") && relationship.equals("padre"))
			{
				System.out.println("TOP SECRET");
			}
			else
			{
				System.out.println(character + ", yo soy tu " + relationship);
			}
		}
	}
}
