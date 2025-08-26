public class SubstringDistance {

    // Recursive function to compute largest substring length
    public static int strDist(String text, String sub) {
        // string shorter than sub
        if (text.length() < sub.length()) {
            return 0;
        }

        // If text starts and ends with sub → return full length
        if (text.startsWith(sub) && text.endsWith(sub)) {
            return text.length();
        }

        // If text does not start with sub → trim from the front
        if (!text.startsWith(sub)) {
            return strDist(text.substring(1), sub);
        }

        // If text does not end with sub → trim from the back
        return strDist(text.substring(0, text.length() - 1), sub);
    }

    public static void main(String[] args) {
        System.out.println("strDist(\"catcowcat\", \"cat\") = " + strDist("catcowcat", "cat"));
        System.out.println("strDist(\"catcowcat\", \"cow\") = " + strDist("catcowcat", "cow"));
        System.out.println("strDist(\"cccatcowcatxx\", \"cat\") = " + strDist("cccatcowcatxx", "cat"));
    }
}