public class Last2 {

    public static int last2(String str) {
        int count = 0;
        String x="";

        if(str.length() <2) return 0;

        String lastString = str.substring(str.length()-2);


        for (int i=0; i<str.length()-2; i++) {
            x= str.substring(i, i+2);
            if (x.equals(lastString))
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String [] args){

        System.out.println( Last2.last2("hixxhi"));
        System.out.println( Last2.last2("xaxxaxaxx"));
        System.out.println( Last2.last2("axxxaaxx"));
        System.out.println( Last2.last2("xxaxxaxxaxx"));
        System.out.println( Last2.last2("13121312"));
        System.out.println( Last2.last2("hi"));

    }
}
