public class StringRepeat {
    public static void main(String[] args) {
        System.out.println(repeatFront3("MAHA"));  // Output: MAHMAHMAH
        System.out.println(repeatFront3("Hi"));    // Output: HiHiHi
    }

    public static String repeatFront3(String str) {
        // Get first 3 characters or entire string if shorter
        String front3Char = (str.length() < 3) ? str : str.substring(0, 3);
        return front3Char + front3Char + front3Char;
    }
}
