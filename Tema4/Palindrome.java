import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println(isPalindrome("Hannah"));
		System.out.println(isPalindrome("Too hot to hoot"));
		System.out.println(isPalindrome("Java is the best language"));
	}
	
	public static boolean isPalindrome(String text)
	{
		text = text.toUpperCase();
		text = text.replace(" ", "");
		boolean result = true;
		
		int cont1 = 0;
		int cont2 = text.length() - 1;
		
		while (cont1 <= cont2 && result)
		{
			if (text.charAt(cont1) == text.charAt(cont2))
			{
				cont1++;
				cont2--;
			}
			else
			{
				result = false;
			}
		}
		return result;
	}
}
