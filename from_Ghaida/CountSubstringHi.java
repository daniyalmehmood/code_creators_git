public class CountSubstringHi {//Recursion-1 > countHi
    public static void main(String[] args) {
        System.out.println(countHiOccurrences("xxhixx"));// → 1
        System.out.println(countHiOccurrences("xhixhix"));// → 2
        System.out.println(countHiOccurrences("hi"));// → 1
    }
    public static int countHiOccurrences(String str) {
        if (str.length() < 2) {
            return 0;
        }
        if (str.substring(0, 2).equals("hi")) {
            return 1 + countHiOccurrences(str.substring(2));
        }
        return countHiOccurrences(str.substring(1));
    }
}