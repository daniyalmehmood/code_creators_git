public class DoubleChar {

    public String duplicateCharacters(String str) {
        StringBuilder result= new StringBuilder();
        for (int i=0;i<str.length();i++){
            result.append(str.substring(i,i+1)+str.substring(i,i+1));
        }
        return result.toString();
    }

}
