import java.util.Scanner;

class FormattedDate
{
/*2.1.6.1.  Create  a  program  called FormattedDate  with  a  class  with  the  same nameinside. 
 * The program will ask the user to enter the day, month and year of birth (allvalues  are  integers). 
 * Then, it  will  print  his  birth  date  with  the  format d/m/y.  For instance, if the user types day = 7, month = 11, year = 1990, 
 * the program will output7/11/1990*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a day: ");
		int day = sc.nextInt();
		System.out.println("Enter a month: ");
		int month = sc.nextInt();
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		System.out.println(day + "/" + month + "/" + year);
		
	}
}
