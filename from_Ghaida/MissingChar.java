public class MissingChar{
	public static  void main(String[] args){
		System.out.println(missingChar("kitten", 1)); // "ktten"
		System.out.println(missingChar("kitten", 0));// "itten"
		System.out.println(missingChar("kitten", 4));// "kittn"
	}
	
	public static String missingChar(String str, int n){
		if(0 <= n && n < str.length()){
			String beforeRemoveIndex =  str.substring(0, n);
			String afterRemoveIndex =  str.substring(n + 1);
			String newString =  beforeRemoveIndex + afterRemoveIndex;
			
			return newString;
			//str.substring(0, n) to return Char before input index
			//str.substring(n + 1) to return Char after that index
		}
		else {
			return str;
		}
	}
}
