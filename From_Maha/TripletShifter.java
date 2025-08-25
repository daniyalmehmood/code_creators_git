//String-2 > oneTwo
public class TripletShifter {
    /**
     * Rearranges every 3-character group in the string by moving
     * the first character to the end of the group.
     */
    public String oneTwo(String str) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < str.length() - 2; i = i + 3) {
            result.append(str.substring(i + 1, i + 3))
                    .append(str.substring(i, i + 1));
        }
        return result.toString();
    }
}
