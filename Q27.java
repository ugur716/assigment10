package assigment10;

public class Q27 {

	public static void main(String[] args) {
		String word = "Certified Wooden Spoon";
		String cover = "o";

		System.out.println(coverString(word, cover));

	}

	public static String coverString(String word, String cover) {

		String result = "";
		int counter = 0;

		for (int i = 0; i <= word.length() - cover.length(); i++) {

			if (word.substring(i, i + cover.length()).equals(cover)) {

				result += word.replace(word.substring(i, i + cover.length()), "[" + cover + "]");
				counter++;
				break;
			}
		}

		if (counter == 0) {
			result = "[" + word + "]";
		}

		return result;
	}


	}


