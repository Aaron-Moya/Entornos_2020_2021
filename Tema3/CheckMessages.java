import java.util.Scanner;

class CheckMessages
{
/*asks the user to type 10 strings.The  program  must store them in  an  array,  and  then  replace the  text  "Eclipse" with"NetBeans" 
 * in  every  string that  contains "Eclipse".*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String[] strings = new String[10];
		
		System.out.println("Enter 10 strings: ");
		for (int i = 0; i < strings.length; i++)
		{
			strings[i] = sc.nextLine();
		}
		
		for (int i = 0; i < strings.length; i++)
		{
			if (strings[i].contains("Eclipse"))
			{
				strings[i] = strings[i].replace("Eclipse", "NetBeans");
			}
			System.out.println(strings[i]);
		}
	}
}
