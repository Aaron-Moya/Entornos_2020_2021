
class Team {
	private String name;
	private int foundationYear;
	
	public Team(String name, int foundationYear) {
		this.name = name;
		this.foundationYear = foundationYear;
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
}

class TeamsExample {
	public static void main(String[] args) {
		Team team1 = new Team("Els Caracols", 1996);
		
		System.out.println(team1.getName() + " - " + team1.getFoundationYear());
	} 
}
