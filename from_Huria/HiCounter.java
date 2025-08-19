public class HiCounter {
    public static int countHi(String str) {
        int countHi = 0;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'h' && str.charAt(i + 1) == 'i') {
                countHi++;
            }
        }
        return countHi;
    }

    public static void main(String[] args) {

        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hiHIhi"));
        System.out.println(countHi("Hi is no HI on ahI"));
        System.out.println(countHi("hiho not HOHIhi"));
        System.out.println(countHi("hi"));
        System.out.println(countHi("h"));
        System.out.println(countHi(""));
    }
}