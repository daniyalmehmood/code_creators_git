public class EqualIsNotChecker {
    public static void main(String[] args) {
        System.out.println(isEqualIsOrNot("This is not"));// → false
        System.out.println(isEqualIsOrNot("This is notnot")); // → true
        System.out.println(isEqualIsOrNot("noisxxnotyynotxisi")); // → true
    }
    public static boolean isEqualIsOrNot(String str) {
        int countIS = 0;
        int countNot = 0;
        if(str == ""){
            return true;
        }
        for (int i = 0; i < str.length()-1; i++) {
            if (i < str.length() - 1 && str.charAt(i) == 'i'  && str.charAt(i + 1) == 's') {
                countIS++;
            }
            if (i < str.length() - 2 && str.substring(i, i + 3).equals("not")) {
                countNot++;
            }
        }
        return countIS == countNot;
    }
}
