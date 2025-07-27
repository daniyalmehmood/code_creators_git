public class String-1{
	
	public String helloName(String name) {
	  return "Hello " + name + "!";
	}
	
	public String makeAbba(String a, String b) {
	  return a + b + b + a;
	}
	
	public String makeTags(String tag, String word) {
	  return "<" +tag + ">" + word + "</" +tag + ">";
	}
	
	public String makeOutWord(String out, String word) {
	  String out1part = out.substring(0, 2);
	  String out2part = out.substring(2, out.length());
	  return out1part + word + out2part;
	}
	
	public String extraEnd(String str) {
	  String newstr = str.substring(str.length()-2);
	  String news = newstr + newstr + newstr;
	  return news;
	}
	
	public String firstTwo(String str) {
	    if(str.length() < 2){
		  return str;
	    }
	    return str.substring(0, 2);
	}
	
	public String firstHalf(String str) {
	  String firstHalf = str.substring(0, str.length() / 2);
	  return firstHalf;
	}
	
	public String withoutEnd(String str) {
	  String withOut = str.substring(1, str.length() - 1);
	  return withOut;
	}
	
	public String comboString(String a, String b) {
	  if (a.length() < b.length()) {
		  return a + b + a;
	  }
	  return b + a + b;
	}
	
	public String nonStart(String a, String b) {
	  a = a.substring(1, a.length());
	  b = b.substring(1, b.length());
	  return a + b;
	}

	public String left2(String str) {
	  String in0 = str.substring(0, 2);
	  String news = str.substring(2);
	  return news + in0;
	}
	
	public String right2(String str) {
	  if (str.length() < 2) {
		  return str;
	  }
	  String last2 = str.substring(str.length() - 2);
	  String restOfString = str.substring(0, str.length() - 2);
	  return last2 + restOfString;
	}
	
	public String theEnd(String str, boolean front) {
	  if(front){
		  str = str.substring(0, 1);
		  return str;
	  }
	  else{
		  str = str.substring(str.length() - 1);
		  return str;
	  }
	}
	
	public String withouEnd2(String str) {
	  if(str.length() < 2){
		  return "";
	  }
	  String withOut = str.substring(1, str.length() - 1);
	  return withOut;
	}
	
	public String middleTwo(String str) {
	  if(str.length() > 2){
		  int middleTwoChar = str.length() /2;
		  return str.substring(middleTwoChar - 1, middleTwoChar + 1);
	  }
	  return str;
	}
	
	public boolean endsLy(String str) {
	  if(str.length() >= 2){
		  return str.substring(str.length() - 2).equals("ly");
	  }
	  return false;
	}
	
	public String nTwice(String str, int n) {
	  if(str.length() > 2){
		  return str.substring(0, n) + str.substring(str.length() - n);
	  }
	  return str;
	}
	
	public String twoChar(String str, int index) {
	  if (index < 1 || index >= str.length() - 1) {
		  return str.substring(0, 2);
	  }
	  return str.substring(index, index + 2);
	}
	
	public String middleThree(String str) {
	  if(str.length() > 3){
		  int middleTwoChar = str.length() /2;
		  return str.substring(middleTwoChar - 1, middleTwoChar + 2);
	  }
	  return str;
	}
	
	public boolean hasBad(String str) {
	  if(str.length() < 3){
		  return false;
	  }
	  if(str.startsWith("bad")){
		  return true;
	  }
	  if(str.length() > 3 && str.substring(1, 4).equals("bad")) {
		  return true;
	  }
	  return false;
	}
	
	public String atFirst(String str) {
	  if (str.length() >= 2) {
		  return str.substring(0, 2);
	  }
	  else if (str.length() == 1) {
		  return str + "@";
	  }
	  else {
		  return "@@";
	  }
	}
	
	public String lastChars(String a, String b) {
	  if(a.isEmpty() && b.isEmpty()){
		  return "@" +  "@";
	  }
	  else if (b.isEmpty()) {
		  return a.charAt(0) + "@";
	  }
	  else if (a.isEmpty()) {
		  return "@" + b.charAt(b.length() - 1);
	  }
	  return a.charAt(0) + "" +  b.charAt(b.length() - 1);
	}
	
	public String conCat(String a, String b) {
	  if(a.isEmpty() || b.isEmpty()){
		return a + b;
	  }
	  else if(a.charAt(a.length() -1) == b.charAt(0)){
		return a + b.substring(1);
	  }
	  return a + b;
	}
	
	public String lastTwo(String str){
	  if(str.length() < 2){
		return str;
	  }
	  return str.substring(0, str.length() - 2) + str.charAt(str.length()-1) + str.charAt(str.length()-2) ;
	}
	
	public String seeColor(String str) {
	  if(str.startsWith("red")){
		  return "red";
	  }
	  else if (str.startsWith("blue")){
		  return "blue";
	  }
	  return "";
	}
	
	public boolean frontAgain(String str) {
	  if (str == "") {
		  return false;
	  }
	  else if(str.length() < 2){
		  return false;
	  }
	  else if (str.substring(0, 2).equals(str.substring(str.length()-2))) {
		  return true;
	  }
	  return false;
	}
	
	public String minCat(String a, String b) {
	  int diffLen = Math.min(a.length(), b.length());
	  if(a.length() > b.length()){
		  return a.substring(a.length()-diffLen) + b.substring(0);
	  } else if (b.length() > a.length()) {
		  return a.substring(0) + b.substring(b.length()-diffLen);
	  }
	  return a + b;
	}
	
	public String extraFront(String str) {
	  if(str.length() > 2){
		  String index12 = str.substring(0, 2);
		  return index12 + index12 + index12;
	  }
	  return str + str + str;
	}
	
	public String without2(String str) {
	  if(str.length() == 2 || str.length() == 0){
		  return "";
	  }
	  else if(str.length() == 1){
		  return str;
	  }
	  else if(str.substring(0,2).equals(str.substring(str.length() -2))){
		  return str.substring(2);
	  }
	  return str;
	}
	
	public String deFront(String str) {
	  StringBuilder newString = new StringBuilder();
	  if (str.length() > 0 && str.charAt(0) == 'a') {
		  newString.append('a');
	  }
	  if (str.length() > 1 && str.charAt(1) == 'b') {
		  newString.append('b');
	  }
	  if (str.length() > 2) {
		  newString.append(str.substring(2));
	  }
	  return newString.toString();
	}
	
	public String startWord(String str, String word) {
	  if(word.length() > str.length()){
		  return "";
	  }
	  if(str.substring(1, word.length()).equals(word.substring(1))){
		  return str.substring(0, word.length());
	  }
	  return "";
	}
	
	public String withoutX(String str) {
	  if(str == ""){
		return "";
	  }
	  if(str.charAt(0) == 'x'){
		  str =  str.substring(1);
	  }
	  if(str.length() > 0 && str.charAt(str.length() - 1) == 'x'){
		  str =  str.substring(0, str.length() - 1);
	  }
	  return str;
	}
	
	public String withoutX2(String str) {
	  StringBuilder newString = new StringBuilder();
	  if(str == ""){
		return str;
	  }
	  if(str.charAt(0) != 'x'){
		  newString.append(str.charAt(0));
	  }
	  if(str.length() > 1 && str.charAt(1) != 'x'){
		  newString.append(str.charAt(1));
	  }
	  if(str.length() > 2){
		  newString.append(str.substring(2));
	  }
	  return newString.toString();
	}

}