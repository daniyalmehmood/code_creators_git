public class CountHi {
    public int CountHi(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals("hi")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        CountHi ch = new CountHi();
        System.out.println(ch.CountHi("abc hi ho"));
        System.out.println(ch.CountHi("ABChi hi"));
        System.out.println(ch.CountHi("hihi"));
    }
}