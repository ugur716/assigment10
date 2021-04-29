package assigment10;

import java.util.Scanner;

public class Q26 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("word:");
		String word =scan.nextLine();
		
		uniqueChars(word);

	}

	public static void uniqueChars(String word) {
		int counter = 0;
		String newWord = "";
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if (word.charAt(i) == word.charAt(j)) {
					if (newWord.contains(word.charAt(i) + "")) {
						continue;
					}

					newWord += word.charAt(i);
				}
			}
		}

		System.out.println(newWord);
	}

	}


