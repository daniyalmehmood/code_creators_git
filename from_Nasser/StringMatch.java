public class StringMatch {

    public static int stringMatch(String a, String b) {

       int lengthA=a.length();
       int lengthB=b.length();
       int fLength;
       int count=0;
       if (lengthA>lengthB){
           fLength=lengthB;
       }
        else fLength=lengthA;

        for(int i = 0; i < (fLength - 1); i++){

            if((a.charAt(i)==b.charAt(i) )&& (a.charAt(i+1)==b.charAt(i+1))){

                 count++;

            }
        }
        return count;
    }

    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz","xxbaaz"));
        System.out.println(stringMatch("abc","abc"));
        System.out.println(stringMatch("abc","axc"));

    }
}
