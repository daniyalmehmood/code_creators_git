public class ExtraEnd {
    public String copiesLastTwoChar(String str) {
        String lastChar = str.substring(str.length() - 2);
        return lastChar + lastChar + lastChar;
    }

}
