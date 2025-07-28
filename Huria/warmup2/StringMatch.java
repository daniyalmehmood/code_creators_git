public class StringMatch {
    public static int stringMatch(String a, String b) {
        int count=0;
        int minLength = Math.min(b.length(), a.length());


        for(int i=0 ; i< minLength-1 ;i++){

            String subA = a.substring(i, i+2);
            String subB = b.substring(i, i+2);

            if (subA.equals(subB)){
                count++;
            }

        }

        return count ;
    }

    public static void main(String [] args){

        System.out.println(StringMatch.stringMatch("xxcaazz", "xxbaaz"));
        System.out.println(StringMatch.stringMatch("abc", "abc"));
        System.out.println(StringMatch.stringMatch("abc", "axc"));
        System.out.println(StringMatch.stringMatch("hello", "he"));
        System.out.println(StringMatch.stringMatch("aabbccdd", "abbbxxd"));
        System.out.println(StringMatch.stringMatch("iaxxai", "aaxxaaxx"));
    }
}
