public class WordEnds {
    public String wordEndsInString(String str, String word) {
        StringBuilder result=new StringBuilder();

        for(int i=0;i<=str.length()-word.length();i++){
            if(str.startsWith(word, i)){
                if(i>0) result.append(str.charAt(i-1));
                if(i+word.length()<str.length()) result.append(str.charAt(i+word.length()));
            }
        }
        return result.toString();
    }
	}