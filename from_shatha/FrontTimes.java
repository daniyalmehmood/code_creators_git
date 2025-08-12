public class FrontTimes {
    public String frontTimes(String str, int n) {
        String front = str.length() < 3 ? str : str.substring(0, 3);
        StringBuilder result = new StringBuilder(front.length() * n);

        for (int i = 0; i < n; i++) {
            result.append(front);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        frontTimes sm = new frontTimes();

        System.out.println(sm.frontTimes("Chocolate", 2));
        System.out.println(sm.frontTimes("Chocolate", 3));
        System.out.println(sm.frontTimes("Abc", 3));
    }
}
