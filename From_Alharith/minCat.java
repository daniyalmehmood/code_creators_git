public class minCat {

    public String minCat(String a, String b) {

        int lenA = a.length();
        int lenB = b.length();


        if (lenA>lenB)  a=a.substring(lenA-lenB);
        if (lenA<lenB)  b=b.substring(lenB-lenA);

        return a + b ;

    }

}
