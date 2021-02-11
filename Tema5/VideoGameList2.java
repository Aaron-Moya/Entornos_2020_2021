import java.util.Scanner;

class VideoGame 
{
	String title;
	String genre;
	float price;
	private Company company;
	
	public VideoGame(String t, String g, float p, String n, int y)
	{
		title = t;
		genre = g;
		price = p;
		setName(n);
		company.foundationYear = y;
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
	
	void setCompany(Company company)
	{
		this.company = company;
	}
}

class Company
{
	private String name;
	private int foundationYear;
	
	public Company(String name, int foundationYear)
	{
		this.name = name;
		this.foundationYear = foundationYear;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getFoundationYear()
	{
		return foundationYear;
	}
	
	public void setFoundationYear(int foundationYear)
	{
		this.foundationYear = foundationYear;
	}
	
}
	
public class VideoGameList2
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
