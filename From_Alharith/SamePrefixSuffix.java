public class SamePrefixSuffix {

    public String longestSamePrefixSuffix(String string) {
        int len=string.length();
        int midLen=len/2;

        for(int i=midLen;i>0;i--){

            if (string.substring(0,i).equals(string.substring(len-i))) {
                return string.substring(0,i);
            }
        }
        return "";

    }

}
