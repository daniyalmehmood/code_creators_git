package String_1;

public class ExtraEnd {
    public String extraEnd(String str) {
        String lastChar=str.substring(str.length()-2);
        return lastChar+lastChar+lastChar;
    }

}
