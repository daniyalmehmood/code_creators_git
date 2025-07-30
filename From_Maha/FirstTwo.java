public class FirstTwo {
    public static void main(String[] args) {
        FirstTwo obj = new FirstTwo();

        System.out.println(obj.firstTwo("Hello"));  // "He"
        System.out.println(obj.firstTwo("abcdefg")); // "ab"
        System.out.println(obj.firstTwo("a"));       // "a"
          
    }


    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }
}
