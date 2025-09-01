public class HiCounter {
    public static int countHiOccurrences(String str) {
    int count = 0;
    for (int i = 0; i < str.length() - 1; i++) {
        if (str.substring(i, i + 2).equals("hi")) {
            count++;
        }
    }
    return count;
}
    public static void main (String[]args){
        System.out.println(countHiOccurrences("abc hi ho"));
        System.out.println(countHiOccurrences("ABChi hi"));
        System.out.println(countHiOccurrences("hihi"));
    }
}
