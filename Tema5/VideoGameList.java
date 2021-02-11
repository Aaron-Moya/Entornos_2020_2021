import java.util.Scanner;

class VideoGame 
{
	String title;
	String genre;
	float price;
	
	public VideoGame(String t, String g, float p)
	{
		title = t;
		genre = g;
		price = p;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String t)
	{
		title = t;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public void setGenre(String g)
	{
		genre = g;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float p)
	{
		price = p;
	}
}
	
public class VideoGameList
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		float minPrice;
		float maxPrice;
		VideoGame[] videoGames = new VideoGame[5];
		
		for (int i = 0; i < videoGames.length; i++)
		{
			System.out.println("Enter the title:");
			String title = sc.nextLine();
			System.out.println("Enter the genre:");
			String genre = sc.nextLine();
			System.out.println("Enter the price:");
			float price = sc.nextFloat();
			sc.nextLine();
			
			videoGames[i] = new VideoGame(title, genre, price);
		}
		
		minPrice = videoGames[0].price;
		maxPrice = videoGames[0].price;
		for (int i = 0; i < videoGames.length; i++)
		{
			if (videoGames[i].price < minPrice)
			{
				minPrice = videoGames[i].price;
			}
			
			if (videoGames[i].price > maxPrice)
			{
				maxPrice = videoGames[i].price;
			}
		}
		
		System.out.println("The cheapest is: " + minPrice);
		System.out.println("The expensive is: " + maxPrice);
	}
}
