public class CountCharX {
    public int countCharX(String str) {
        int count = 0;
        if (str.contains(" ")) {
            int space = str.indexOf(" ");
            String firstWord = str.substring(0, space);
            for (int i = 0; i < firstWord.length(); i++) {
                if (firstWord.charAt(i) == ('x')) {
                    count++;
                }
            }
            return count;
        } else if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ('x')) {
                    count++;
                }
            }
            if (count > 0) {
                return count - 1;
            }
            return count;
        } else {
            return 0;
        }

    }
}