public class MirrorEndsFinder {
    // Method to find mirror ends
    public static String findMirrorEnds(String text) {
        StringBuilder mirrorPart = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char startChar = text.charAt(i);
            char endChar = text.charAt(text.length() - 1 - i);

            if (startChar == endChar) {
                mirrorPart.append(startChar);
            } else {
                break; 
            }
        }

        return mirrorPart.toString();
    }

    public static void main(String[] args) {
        System.out.println(findMirrorEnds("abXYZba")); 
        System.out.println(findMirrorEnds("abca"));   
        System.out.println(findMirrorEnds("aba"));    
    }
}