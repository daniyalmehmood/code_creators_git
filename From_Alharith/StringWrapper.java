public class StringWrapper  {

    public String addLastCharAround(String str) {
        if (str.length()<=1){
            return str +str+str;
        }
        return str.charAt(str.length()-1) +str + str.charAt(str.length()-1);
    }
}
