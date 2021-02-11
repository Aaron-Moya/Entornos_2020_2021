import java.util.Scanner;

class Book
{
	private String title;
	private float price;
	private int numPages;
	public Author author;
	
	public void Books(String t, float p, int n, Author a)
	{
		title = t;
		price = p;
		numPages = n;
		author = a;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public float getPrice()
	{
		return price;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public int getNumPages()
	{
		return numPages;
	}
	
	public void setNumPages(int numPages)
	{
		this.numPages = numPages;
	}
	
	public Author getAuthor()
	{
		return author;
	}
	
	public void setAuthor(Author author)
	{
		this.author = author;
	}
	
}

class Author
{
	private String name;
	private int yearBirth;
	
	public void Author(String n, int y)
	{
		name = n;
		yearBirth = y;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getYearBirth()
	{
		return yearBirth;
	}
	
	public void setYearBirth(int yearBirth)
	{
		this.yearBirth = yearBirth;
	}
}

class Books
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Book book = new Book("Madagascar", 30.5, 164, "Manolo Escobar", 1973);
		Author author = new Author();
	
		book.setAuthor(author);
		
		System.out.println(book.getTitle() + ", " + book.getPrice() + ", " + book.getNumPages()
		+ ", " + book.author.getName() + ", " + book.author.getYearBirth());
	}
}
