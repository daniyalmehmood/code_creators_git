public class ZipZap {

    public String removeMiddleCharInZipZap(String str) {
        StringBuilder result= new StringBuilder();

        for (int i=0; i<str.length(); i++){

            if ((str.length()>2 &&str.charAt(i)==('z'))&& (str.charAt(i+2)==('p'))){
                result.append(str.substring(i,i+1)+str.substring(i+2,i+3));
                i+=2;
            }else result.append(str.substring(i,i+1));
        }
        return result.toString();
    }

}
