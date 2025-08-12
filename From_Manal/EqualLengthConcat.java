public class EqualLengthConcat {
    //function to trim longer string, concatenate both
    public static String concatWithTrimToShortest(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        if (lenA > lenB) {
            a = a.substring(lenA - lenB);
        }
        else if (lenB > lenA) {
            b = b.substring(lenB - lenA);
        }
        return a +b;
    }
    public static void main(String[] args) {
        System.out.println(concatWithTrimToShortest("Hello", "Hi"));
        System.out.println(concatWithTrimToShortest("Hello", "java") );
        System.out.println(concatWithTrimToShortest("java", "Hello"));
    }

}
