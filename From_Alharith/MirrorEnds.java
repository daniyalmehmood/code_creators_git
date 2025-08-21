public class MirrorEnds {

    public String longestMirroredPrefix(String string) {
        StringBuilder result= new StringBuilder();

        for (int i=0; i<string.length(); i++){

            if (string.charAt(i)==string.charAt(string.length()-1-i)){
                result.append(string.charAt(i));
            }
            else break;
        }
        return result.toString();
    }

}
