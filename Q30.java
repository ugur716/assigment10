package assigment10;

public class Q30 {

	public static void main(String[] args) {
		
		System.out.println(at3("longword","foo"));
		System.out.println(at3("blabla","a"));
		

	}public static String at3(String word1,String word2) {
		
		
		return word1.substring(0, 3).concat(word2).concat(word1.substring(3));
	}

}
