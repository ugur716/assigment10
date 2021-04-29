package assigment10;

public class Q25 {

	public static void main(String[] args) {

        System.out.println(mergeStrings("java", "selenium"));

    }
    
    public static String mergeStrings(String str1, String str2) {
        
          String first="";
          String second="";
          int length;
          
          if(str1.length()>str2.length()) {
             length=str2.length();
             second=str1.substring(str2.length(),str1.length());
          }
          else {
              length=str1.length();
              second=str2.substring(str1.length(),str2.length());
          }

          for(int i=0;i<length;i++) {
              first += str1.substring(i,i+1)+str2.substring(i,i+1);

          } 
          
        return first+second;            
        

	}

}
