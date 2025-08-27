public class TripletRotator {
    public String rotateTriplets(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length() - 2; i += 3) {
            char firstChar = str.charAt(i);
            result.append(str.substring(i + 1, i + 3));
            result.append(firstChar);
        }
        return result.toString();
    }
}
    

