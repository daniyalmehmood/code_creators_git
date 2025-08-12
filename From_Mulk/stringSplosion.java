public class StringSplosion{
public String stringSplosion(String str){
  StringBuilder str1 = new StringBuilder();
  for (int i = 1; i <= str.length(); i++) {
    str1.append(str.substring(0, i));
  }
     return str1.toString();
  }