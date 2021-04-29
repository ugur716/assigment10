package assigment10;

import java.util.Scanner;

public class Q28 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("text:");
		String text =scan.nextLine();
		System.out.println("badword:");
		String badWord =scan.nextLine();
		clean(text, badWord);

	}

	public static void clean(String text, String badWord) {

		for (int i = 0; i <= text.length() - badWord.length(); i++) {
			if (text.substring(i, i + badWord.length()).equals(badWord)) {
				text = text.replace(text.substring(i, i + badWord.length()), "");
			}
		}
		System.out.println(text);

	}

}
