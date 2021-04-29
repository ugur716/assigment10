package assigment10;

import java.util.Scanner;

public class Q19 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Word:");
		
		String word =scan.nextLine();
		System.out.println("specific word");
		String specificWord =scan.nextLine();
		int num = 0;

		if (word.length() < specificWord.length()) {
			System.out.println("Word length must be greater than or equal Specific Word");
		}

		for (int i = 0; i < word.length() - 3; i++) {
			if (word.substring(i, i + 4).equals(specificWord)) {
				num++;
			}
		}
		System.out.println(num);
	}

	}


