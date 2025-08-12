public class GetSandwich {
    public static String middleBetweenBread(String str) {
        int firsBread = -1;
        int lastBread = -1;
        for (int i = 0; i <= str.length() - 5; i++) {
            if (str.substring(i, i + 5).equals("bread")) {
                if (firsBread == -1) {
                    firsBread = i;
                }
                lastBread = i;
            }
        }
        if (firsBread == -1 || lastBread == -1 || firsBread == lastBread) {
            return "";
        }

        return str.substring(firsBread + 5, lastBread);
    }

    public static void main(String[] args) {
        System.out.println(middleBetweenBread("breadjambread"));
        System.out.println(middleBetweenBread("xxbreadjambreadyy"));
        System.out.println(middleBetweenBread("xxbreadyy"));
    }
}
