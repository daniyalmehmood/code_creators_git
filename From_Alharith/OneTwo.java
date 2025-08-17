public class OneTwo {

    public String rotateTripletsLeft(String str) {
        StringBuilder result= new StringBuilder();
        for (int i=1; i<str.length()-1; i+=3){
            result.append (str.substring(i,i+2)+str.charAt(i-1));
        }
        return result.toString();
    }

}
