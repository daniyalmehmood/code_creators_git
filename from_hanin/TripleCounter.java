public class TripleCounter {
    public int countConsecutiveTriples(String str) {
        int count=0;
        for (int i = 0; i < str.length() - 2; i++) {
            char character = str.charAt(i);
            if (character == str.charAt(i + 1) && character == str.charAt(i + 2)){
                count ++;
            }
        }
        return count;
    }

}
