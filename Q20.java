package assigment10;

import java.util.Scanner;

public class Q20 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("number:");
		int num=scan.nextInt();
		System.out.println("sum");
		int sum=1;
		
		

		if (num < 0) {
			System.out.println("Invalid number!");
			return;
		}

		for (int i = 1; i <= num; i++) {
			sum *= i;
		}

		System.out.println(sum);
	}
	}


