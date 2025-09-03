public class OneTwoTransformer {
    public static String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        // Process the string in chunks of 3 characters
        for (int i = 0; i <= str.length() - 3; i += 3) {String group = str.substring(i, i + 3);
            String transformedGroup = "" + group.charAt(1) + group.charAt(2) + group.charAt(0);
            result.append(transformedGroup);
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(oneTwo("abc"));
        System.out.println(oneTwo("tca"));
        System.out.println(oneTwo("tcagdo"));
    }
}