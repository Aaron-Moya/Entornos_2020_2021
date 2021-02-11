import java.util.Scanner;

class GroupPeople
{
/*2.2.2.1. Create a program called GroupPeople that asks the user to enter how manypeople is  going to  attend to  a  conference. 
 * The  program  must create groups of(preferably) 50  people. Whenever  this  is  not  possible, then  it  will  attempt  to  creategroups of 10 people, 
 * and finally it will create groups of 1 person. The program mustoutput how many groups of each category are necessary. 
 * For instance, if 78 people aregoing to attend to the conference, then we need 1 group of 50 people, 2 groups of 10people and 8 groups of 1 people.*/	
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int bigGroup = 0, mediumGroup = 0, littleGroup = 0;
		
		System.out.println("Enter the number of people: ");
		int people = sc.nextInt();

		while (people >= 50)
		{
			bigGroup++;
			people -= 50;
		}
		while (people >= 10)
		{
			mediumGroup++;
			people -= 10;
		}
		while (people >= 1)
		{
			littleGroup++;
			people -= 1;
		}
		
		System.out.println(bigGroup + " group of 50 people, " + mediumGroup + " groups of 10 people and " + littleGroup + " groups of 1 people");
	}
}
