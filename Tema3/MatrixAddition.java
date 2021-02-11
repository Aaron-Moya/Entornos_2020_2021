import java.util.Scanner;

class MatrixAddition
{
/*asks  the  user  to  enter twobidimensional matrices  of  3  rows  and  columns, and  then  prints the  result  of  addingthem. 
 * Remember, in order to add two matrices*/
 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int[][] matrixA = new int[3][3];
		int[][] matrixB = new int[3][3];
		int result = 0;
		
		System.out.println("Enter numbers: ");
		
		for (int i = 0; i < matrixA.length; i++)
		{
			for (int j = 0; j < matrixA[i].length; j++)
			{
				matrixA[i][j] = sc.nextInt();
				result += matrixA[i][j];
			}
		}
		
		for (int i = 0; i < matrixB.length; i++)
		{
			for (int j = 0; j < matrixB[i].length; j++)
			{
				matrixB[i][j] = sc.nextInt();
				result += matrixB[i][j];
			}
		}
		
		System.out.println("The numbers are: ");
		
		for (int i = 0; i < matrixA.length; i++)
		{
			for (int j = 0; j < matrixA[i].length; j++)
			{
				System.out.println(matrixA[i][j]);
			}
		}
		
		for (int i = 0; i < matrixB.length; i++)
		{
			for (int j = 0; j < matrixB[i].length; j++)
			{
				System.out.println(matrixB[i][j]);
			}
		}
		System.out.println("The result is: " + result);
	}
}
