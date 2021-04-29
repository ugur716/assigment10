package assigment10;

public class Q31 {

	public static void main(String[] args) {
		String str="Nurses Run";
		String dummy="";
		String str1=str.replaceAll(" ", "");
		
		

		
		for(int a=str1.length()-1;a>=0;a--) {
			
			dummy=dummy+str1.charAt(a);
			
			
			}
		if(str1.equalsIgnoreCase(dummy)) {
			
			
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		

	}

}
