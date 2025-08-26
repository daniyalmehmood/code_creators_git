//String-3 > mirrorEnds
public class StringMirror {
    public String longestMirrorPrefix(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                result.append(input.charAt(i));
            } else {
                break;
            }
        }
        return result.toString();
    }
}
