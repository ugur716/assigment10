package assigment10;

import java.util.Scanner;

public class Q22 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);

		
		
		System.out.println("html:");
		String html =scan.nextLine();
		if (!(html.contains("html"))) {
			System.out.println("Invalid input!");
			return;
		}

		int indexOfFirstQuote = html.indexOf('"');
		int indexOfSecondQuote = html.indexOf('"', indexOfFirstQuote + 1);

		String wordBetweenTwoQuote = html.substring(indexOfFirstQuote + 1, indexOfSecondQuote);
		System.out.println(wordBetweenTwoQuote);

	}

	}


