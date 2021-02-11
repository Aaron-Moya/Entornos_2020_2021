class WaitApp
{
	public static void main(String[] args)
	{
		try {
			waitSeconds(Integer.parseInt(args[0]));
		} catch(InterruptedException e)
		{
			System.err.println("Interruption during sleep: " + e.getMessage());
		}
	}
	
	public static void waitSeconds(int seconds) throws InterruptedException
	{
		Thread.sleep(seconds * 1000);
	}
}
