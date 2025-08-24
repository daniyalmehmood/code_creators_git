public class CharacterDoubler {
    public static String duplicateEachChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= str.length() - 1; i++) {
            for (int j = 0; j < 2; j++) {
                result.append(str,i,i+1);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(duplicateEachChar("Hi"));
        System.out.println(duplicateEachChar("The"));
    }
}
