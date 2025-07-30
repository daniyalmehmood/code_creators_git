public class stringX {

    public String stringX(String str) {

        String result = "";
        for (int i = 0; i < str.length(); i++) {

            if (!(str.substring(i, i + 1).equals("x") && i > 0 && i < (str.length() - 1))) {
                result = result + str.substring(i, i + 1);
            }
        }
        return result;
    }
}
