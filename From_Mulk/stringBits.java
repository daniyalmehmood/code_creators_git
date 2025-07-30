public class StringBits{
public String stringBits(String str) {
  StringBuilder str1 = new StringBuilder();
  for (int i = 0; i < str.length() ; i +=2) {
      str1.append(str.charAt(i));
 }
    return str1.toString();
}
}
