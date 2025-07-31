public class StringTimes {
    public static String stringTimes(String str, int n) {
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < n; i++){
            newStr.append(str);
        }
        return newStr.toString();
    }

    public static void main(String[] args) {

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));

    }
}

