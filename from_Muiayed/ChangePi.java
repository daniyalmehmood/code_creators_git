public class ChangePi {
  public static void main(String[] args) {
    System.out.println(changePi("xpix"));
    System.out.println(changePi("pipi"));
    System.out.println(changePi("pip"));
  }

  public static String changePi(String str) {
    if (str.length() < 2) return str;
    if (str.substring(0, 2).equals("pi")) return "3.14" + changePi(str.substring(2));
    return str.charAt(0) + changePi(str.substring(1));
  }
}