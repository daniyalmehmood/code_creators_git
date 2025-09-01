public class CountHi {
  public static void main(String[] args) {
    System.out.println(countHi("xxhixx"));
    System.out.println(countHi("xhixhix"));
    System.out.println(countHi("hi"));
  }

  public static int countHi(String str) {
    if (str.length() < 2) return 0;
    if (str.substring(0, 2).equals("hi")) return 1 + countHi(str.substring(2));
    return countHi(str.substring(1));
  }
}