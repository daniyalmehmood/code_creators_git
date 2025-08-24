public class FirstHalf {
    public String getFirstHalfOfString(String str) {
        int middleLength = str.length() / 2;
        return str.substring(0, middleLength);
    }

}

