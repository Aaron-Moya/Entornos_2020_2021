class CountOcurrences
{
	boolean result;
	
	public static void main(String[] args)
	{
		System.out.println(CountOcurrences("This string is just a sample string", "string", 2));
	}
	
	public static boolean CountOcurrences(String a, String b, int n)
	{
		String[] aParts = a.split(" ");
		int cont = 0;
		
		for (int i = 0; i < aParts.length; i++)
		{
			if (aParts[i].contains(b))
			{
				cont++;
			}
		}
		return n == cont;
	}
}
