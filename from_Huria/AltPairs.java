public class AlternatePairSelector {
    public static String skipTwoTakeTwo(String str) {
        StringBuilder result = new StringBuilder();

        if (str.length() <= 2) {
            return str;
        }
        for (int i = 0; i < str.length(); i = i + 4) {
            int last = i + 2;
            if (last > str.length()) {
                last = str.length();
            }
            result.append(str, i, last);
        }
        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(skipTwoTakeTwo("kitten"));
        System.out.println(skipTwoTakeTwo("Chocolate"));
        System.out.println(skipTwoTakeTwo("CodingHorror"));
        System.out.println(skipTwoTakeTwo("yak"));
        System.out.println(skipTwoTakeTwo("y"));
        System.out.println(skipTwoTakeTwo(""));
    }
}
