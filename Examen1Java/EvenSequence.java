import java.util.Scanner;

class EvenSequence {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sequence = false;
		
		System.out.println("Enter a sequence of numbers:");
		String numbersString = sc.nextLine();
		String[] parts = numbersString.split(" ");
		int[] numbers = new int[parts.length];
		
		for (int i = 0; i < parts.length; i++) {
			numbers[i] = Integer.parseInt(parts[i]);
		}
		
		for (int i = 0; i < numbers.length - 1; i++) {
			if (numbers[i] % 2 == 0 && numbers[i + 1] == numbers[i] + 2 || numbers[i + 1 ] == numbers[i] - 2) {
				sequence = true;
			} 
			else {
				sequence = false;
				break;
			}
		}
		
		if (sequence) {
			System.out.println("EVEN SEQUENCE");
		} else {
			System.out.println("NON EVEN SEQUENCE");
		}
	}
	
}
