public class FrontRepeater {

    public String repeatFrontSegment(String str, int n) {
        StringBuilder results = new StringBuilder();

        for (int i = 0; i <n; i++) {
            String startWord = str.substring(0,n-i);
            results.append(startWord);

        }

        return results.toString();
    }


