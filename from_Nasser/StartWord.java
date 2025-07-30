public class StartWord {

    public String startWord(String str, String word) {
        char[] strW=str.toCharArray();
        char[]  wordW=word.toCharArray();
        StringBuilder string1=new StringBuilder();
        if (str.isEmpty()||word.isEmpty() || word.length()>str.length()) return "";
        for(int i=1;i<word.length();i++){

            if(strW[i]==wordW[i]){
                string1.append(strW[i]);
            } else  {
                return "";

            }


        }
        return str.charAt(0)+string1.toString();
    }

}
