public class PlusOut {

    public String maskExceptWord(String str, String word) {
        StringBuilder result= new StringBuilder();

        for (int i=0; i< str.length();){

            if (i <= str.length() - word.length() && str.substring(i,i+word.length()).equals(word)){
                result.append(word);
                i+=word.length();
            } else {
                result.append("+");
                i++;
            }
        }
        return result.toString();
    }

}
