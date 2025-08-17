public class StringComparer {

    public int countMatchingSubstrings(String a, String b) {

        int len = 0;
        if (a.length() > b.length()) len = b.length();
        else len = a.length();

        int count = 0;

        for (int i = 0; i < len - 1; i++) {
            String asub = a.substring(i, i + 2);
            String bsub = b.substring(i, i + 2);
            if (asub.equals(bsub)) count++;
        }
        return count;
    }
}
