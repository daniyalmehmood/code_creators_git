public class SubstringPicker {
    public static String getTwoCharsFromIndex(String str, int index) {
        //Check if the index is valied to get two characters
        if (index < 0 || index + 2 > str.length()) {
            return str.substring(0, 2);
        }
        return str.substring(index, index + 2);
    }
    public static void main(String[] args) {
        System.out.println(getTwoCharsFromIndex("java", 0));
        System.out.println(getTwoCharsFromIndex("java", 2));
        System.out.println(getTwoCharsFromIndex("java", 3) );
    }
}
