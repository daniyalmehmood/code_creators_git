public class StrCopies {
  public static void main(String[] args) {
    System.out.println(strCopies("catcowcat", "cat", 2));
    System.out.println(strCopies("catcowcat", "cow", 2));
    System.out.println(strCopies("catcowcat", "cow", 1));
  }

  public static boolean strCopies(String str, String sub, int n) {
    if (n == 0) return true;
    if (str.length() < sub.length()) return false;
    if (str.substring(0, sub.length()).equals(sub)) return strCopies(str.substring(1), sub, n - 1);
    return strCopies(str.substring(1), sub, n);
  }
}