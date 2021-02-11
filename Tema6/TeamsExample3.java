
class Team {
	private String name;
	private int foundationYear;
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;
	private Captain captain;
	static int count = 0;
	
	public Team(String name, int foundationYear, Player player1, Player player2, Player player3, Player player4, Captain captain) {
		this.name = name;
		this.foundationYear = foundationYear;
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
		this.captain = captain;
		count++;
	}
	
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getFoundationYear() {
		return foundationYear;
	}
	
	public void setFoundationYear(int foundationYear) {
		this.foundationYear = foundationYear;
	}
	
	public Player getPlayer1() {
		return player1;
	}
	
	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}
	
	public Player getPlayer2() {
		return player2;
	}
	
	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}
	
	public Player getPlayer3() {
		return player3;
	}
	
	public void setPlayer3(Player player3) {
		this.player3 = player3;
	}
	
	public Player getPlayer4() {
		return player4;
	}
	
	public void setPlayer4(Player player4) {
		this.player4 = player4;
	}
	
	public Captain getCaptain() {
		return captain;
	}
	
	public void getCaptain(Captain captain) {
		this.captain = captain;
	}
}

class Player {
	private String name;
	private int age;
	private int backNumber;
	
	public Player(String name, int age, int backNumber) {
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setYear(int year) {
		this.age = age;
	}
	
	public int getBackNumber() {
		return backNumber;
	}
	
	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}
	
}

class Captain extends Player {
	private int yearsExperience;
	
	public Captain(String name, int age, int backNumber, int yearsExperience) {
		super(name, age, backNumber);
		this.yearsExperience = yearsExperience;
	}
	
	public int getYearsExperience() {
		return yearsExperience;
	}
	
	public void setYearsExperience(int yearsExperience) {
		this.yearsExperience = yearsExperience;
	}
}

class TeamsExample3 {
	public static void main(String[] args) {
		Player p1 = new Player("Paco", 20, 1);
		Player p2 = new Player("Manolo", 23, 5);
		Player p3 = new Player("Guillermo", 26, 3);
		Player p4 = new Player("Willy", 19, 10);
		Captain captain = new Captain("Angel", 29, 8, 10);
		
		
		Team team1 = new Team("Los caracoles", 1986, p1, p2, p3, p4, captain);
		Team team2 = new Team("Los sd", 2016, p1, p2, p3, p4, captain);
		
		System.out.println(team1.getName() + " - " + team1.getFoundationYear());
		System.out.println("Players: ");
		System.out.println(team1.getPlayer1().getName() + " - " + team1.getPlayer1().getAge() + " - " + team1.getPlayer1().getBackNumber());
		System.out.println(team1.getPlayer2().getName() + " - " + team1.getPlayer2().getAge() + " - " + team1.getPlayer2().getBackNumber());
		System.out.println(team1.getPlayer3().getName() + " - " + team1.getPlayer3().getAge() + " - " + team1.getPlayer3().getBackNumber());
		System.out.println(team1.getPlayer4().getName() + " - " + team1.getPlayer4().getAge() + " - " + team1.getPlayer4().getBackNumber());
		System.out.println("\nCaptain:");
		System.out.println(team1.getCaptain().getName() + " - " + team1.getCaptain().getAge() + " - " + team1.getCaptain().getBackNumber() + " - " + team1.getCaptain().getYearsExperience());
		
		System.out.println("\nCount of teams: " + team1.count);
	} 
}
