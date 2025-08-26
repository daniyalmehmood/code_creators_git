public class RotateFirstCharInTriplets {
    public static String rotateFirstCharInTriplets(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            result.append(str.charAt(i + 1));
            result.append(str.charAt(i + 2));
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {

        System.out.println(rotateFirstCharInTriplets("abc"));
        System.out.println(rotateFirstCharInTriplets("tca"));
        System.out.println(rotateFirstCharInTriplets("tcagdo"));
        System.out.println(rotateFirstCharInTriplets("chocolate"));
        System.out.println(rotateFirstCharInTriplets("1234567890"));
    }
}
