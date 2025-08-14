public class StringBuilderUtil  {

    public String buildStringExplosion(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= i; j++) {
                result += str.substring(j, j + 1);
            }

        }
        return result;
    }
}
