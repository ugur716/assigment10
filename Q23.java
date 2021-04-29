package assigment10;

import java.util.Scanner;

public class Q23 {

	public static void main(String[] args) {
		
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Input: ");
	        String str = scan.next();

	        int count = 0;

	        for (int i = 0; i < str.length() - 4; i++) {
	            if (str.substring(i, i + 5).equalsIgnoreCase("bread")) {
	                count++;
	            }
	        }
	        if (count < 2 || count > 2) {
	            System.out.println("nothing");
	        } else {

	            String word = str.replaceAll("bread", "*");

	            int n1 = word.indexOf('*');
	            int n2 = word.lastIndexOf('*');

	            if (n1+1 == n2) {
	                System.out.println("Empty Sandwich");
	            } else {
	                System.out.println(word.substring(n1 + 1, n2));
	            }
	        }

	}

}
