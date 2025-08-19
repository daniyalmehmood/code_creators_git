public class CoeCounter {
    public static int countCoe(String str) {
        int countCoe = 0;
        for (int i = 0; i < str.length() - 3; i++) {

            if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
                countCoe++;
            }
        }
        return countCoe;
    }

    public static void main(String[] args) {

        System.out.println(countCoe("aaacodebbb"));
        System.out.println(countCoe("xxcozeyycop"));
        System.out.println(countCoe("cozcop"));
        System.out.println(countCoe("AAcodeBBcoleCCccoreDD"));
        System.out.println(countCoe("ode"));
        System.out.println(countCoe("c"));
        System.out.println(countCoe(""));
        System.out.println(countCoe("coAcodeBcoleccoreDD"));

    }
}