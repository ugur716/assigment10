package assigment10;



public class Q21 {

	public static void main(String[] args) {
		String word = "abXYabc";
		int range = 2;
		int counter = 0;
		boolean flag = false;

		String appearingWord = word.substring(0, range);

		for (int i = 0; i < word.length(); i++) {
			if (word.contains(appearingWord)) {
				flag = true;
				counter++;
				word = word.replaceFirst(appearingWord, "");
			}
		}
		System.out.println(flag + " " + appearingWord + " appears " + counter);

	}
		
	}
	


