public class StringTimes{
 public String stringTimes(String str, int n) {
    StringBuilder str1 = new StringBuilder();
    for (int i = 0; i < n; i++) {
        str1.append(str);
    }  
       return str1.toString();
}
}