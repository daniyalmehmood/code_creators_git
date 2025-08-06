public class CountHi {
    public static int totalHiFound(String str) {
        int hiCount  = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                hiCount ++;
            }
        }
        return hiCount ;
    }

    public static void main(String[] args) {
        System.out.println(totalHiFound("abc hi ho"));
        System.out.println(totalHiFound("ABChi hi"));
        System.out.println(totalHiFound("hihi"));
    }
}
