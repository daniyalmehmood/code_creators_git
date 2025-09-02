public class StrCount {
  public static void main(String[] args) {
    System.out.println(strCount("catcowcat", "cat"));
    System.out.println(strCount("catcowcat", "cow"));
    System.out.println(strCount("catcowcat", "dog"));
  }

  public static int strCount(String str, String sub) {
    if (str.length() < sub.length()) return 0;
    if (str.substring(0, sub.length()).equals(sub)) return 1 + strCount(str.substring(sub.length()), sub);
    return strCount(str.substring(1), sub);
  }
}