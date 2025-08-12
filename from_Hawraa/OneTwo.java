public class OneTwo {
    public static String movingChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i + 2 < str.length(); i += 3) {
            String triplet = str.substring(i, i + 3);
            String shiftTriplet = triplet.substring(1) + triplet.charAt(0);
            result.append(shiftTriplet);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(movingChar("abc"));
        System.out.println(movingChar("tca"));
        System.out.println(movingChar("tcagdo"));
    }
}
