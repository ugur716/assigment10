package assigment10;

import java.util.Scanner;

public class Q18 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("word:");
		
		String word =scan.nextLine();
		
		System.out.println("seperator :");
		String seperator =scan.nextLine();
		
		System.out.println("num :");
		int num=scan.nextInt();
		
	
		
		for(int i = 0; i<num; i++) {
			System.out.print(word);
			
			if(i<num-1) {
				System.out.print(seperator);
			}
		}
		

	}

}
