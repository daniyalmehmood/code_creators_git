public class EndTripler {
    public static String endTripler(String str) {
        if (str.length() > 2) {
            String end = str.substring(str.length() - 2);
            return end.repeat(3);
        }
        else {
            return str.repeat(3);
        }
    }

    public static void main(String[] args) {
        System.out.println(EndTripler.endTripler("Hello"));
        System.out.println(EndTripler.endTripler("ab"));
        System.out.println(EndTripler.endTripler("Hi"));
        System.out.println(EndTripler.endTripler("Candy"));
        System.out.println(EndTripler.endTripler(""));
        System.out.println(EndTripler.endTripler("a"));
    }
}
