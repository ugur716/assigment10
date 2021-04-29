package assigment10;

import java.util.Scanner;

public class Q16 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter input:");

		String words=scan.nextLine();
		
		if(words.substring(0, 4).equals("java")||words.substring(1, 5).equals("java")) {
			
			System.out.println(true);
		}else {
			
			System.out.println(false);
		}

	}

}
