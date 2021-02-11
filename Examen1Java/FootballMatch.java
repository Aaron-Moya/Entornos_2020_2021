import java.util.Scanner;

class FootballMatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("RESULTS:");
		String results = sc.nextLine();
		results = results.replace(' ','-');
		String[] partsString = results.split("-");
		int[] partsInt = new int[partsString.length];
		
		int won = 0, lost = 0, drawn = 0, totalPoints = 0;
		
		
		try {
			for (int i = 0; i < partsString.length; i++) {
				partsInt[i] = Integer.parseInt(partsString[i]);
			}
		} catch(Exception e) {
			System.out.println("Incorrect result found");
			System.exit(0);
		}
		
		for (int i = 0; i < partsInt.length; i++) {
			if (i % 2 == 0 && partsInt[i] > partsInt[i + 1]) {
				won++;
			}
			
			if (i % 2 == 0 && partsInt[i] < partsInt[i + 1]) {
				lost++;
			}  
			
			if (i % 2 == 0 && partsInt[i] == partsInt[i + 1]) {
				drawn++;
			}
			
			if (i % 2 == 0) {
				totalPoints += partsInt[i];
			}
		}
		
		System.out.println("Matches won: " + won);
		System.out.println("Matches lost: " + lost);
		System.out.println("Matches drawn: " + drawn);
		System.out.println("TOTAL POINTS: " + totalPoints);
	}
}
