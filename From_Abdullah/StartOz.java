public class StartOz {
    public String firstCharOSecondCharZ(String str) {
        String finalresult = "";

        if (str .length() >= 1 && str.charAt(0) == 'o') {
            finalresult = finalresult + str.charAt(0);
        }
        if (str .length() >= 2 && str.charAt(1) == 'z') {
            finalresult = finalresult + str.charAt(1);
        }
        return finalresult;

    }
}
