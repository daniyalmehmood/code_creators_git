public class oneTwo {
    public static void main(String[] args) {
        System.out.println(oneTwo("abc")); //"bca"
        System.out.println(oneTwo("tca")); //"cat"
        System.out.println(oneTwo("tcagdo")); //"catdog"
    }
    public static String oneTwo(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i+=3) {
            newString.append(str.charAt(i + 1));
            newString.append(str.charAt(i + 2));
            newString.append(str.charAt(i));
        }
        return newString.toString();
    }
}
