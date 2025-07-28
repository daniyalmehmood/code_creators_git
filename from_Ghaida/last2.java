public class last2 {
    public static void main(String[] args) {
        System.out.println(last2("hixxhi")); //1
        System.out.println(last2("xaxxaxaxx")); //1
        System.out.println(last2("axxxaaxx")); //2
    }
    public static int last2(String str) {
        if (str.length() < 2) {//string can't be less 2 character
            return 0;
        }
        String last2 = str.substring(str.length() - 2);
        int count = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(last2)) {
                count++;
            }
        }
        return count;
    }
}