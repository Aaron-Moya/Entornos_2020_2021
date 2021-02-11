
class Unreal {
	static boolean isUnreal(int number) {
		int count;
		
		for (int i = 0; i < number.length; i++) {
			if (number[i] < number[i + 1]) {
				count++;
			}
		}
		
	}

	static void main(String[] args) {
		isUnreal();
	}
}
