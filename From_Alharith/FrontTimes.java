public class FrontTimes  {

    public String repeatFrontNTimes(String str, int n) {
        int length = 3;
        if (str.length() < 3) {
            length = str.length();
        }


        String front = str.substring(0, length);
        String result = "";
        for (int i = 0; i < n; i++) {
            result = front + result;
        }
        return result;
    }
}
