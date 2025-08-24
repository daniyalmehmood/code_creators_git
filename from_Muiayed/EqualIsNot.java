public class EqualIsNot {
    public static boolean equalIsNot(String str) {
        int is = 0, not = 0;
        for (int i = 0; i <= str.length() - 2; i++)
            if (str.substring(i, i + 2).equals("is")) is++;
        for (int i = 0; i <= str.length() - 3; i++)
            if (str.substring(i, i + 3).equals("not")) not++;
        return is == not;
    }

    public static void main(String[] args) {
        System.out.println(equalIsNot("This is not"));
        System.out.println(equalIsNot("This is notnot"));
        System.out.println(equalIsNot("noisxxnotyynotxisi"));
    }
}