public class GroupTransformer {
    public static String shiftTriplets(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <= str.length() - 3; i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }

        return result.toString();
    }
    public static void main (String[]args){
        System.out.println(shiftTriplets("abc"));
        System.out.println(shiftTriplets("tca"));
        System.out.println(shiftTriplets("tcagdo"));
    }
}
