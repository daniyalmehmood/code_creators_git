public class StringMatching {
    public static int stringMatch(String a, String b) {

        int count=0;

        int index = Math.min(a.length(),b.length());
        for (int i=0; i+1 < index;i++){

            if(a.substring(i,i+2).equals(b.substring(i,i+2))){

                count++;

            }
        }
        return count;

    }

    public static void main(String[] args) {

        System.out.println(stringMatch("abc","abc"));

    }
}
