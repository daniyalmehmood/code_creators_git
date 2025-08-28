public class CountYZ {

    public static int countYZ(String str) {
        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ((c == 'y' || c == 'z') &&
                    (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1)))) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countYZ("fez day"));
        System.out.println(countYZ("day fez"));
        System.out.println(countYZ("day fyyyz"));
        System.out.println(countYZ("day:yak"));
        System.out.println(countYZ("!!day--yaz!!"));
        System.out.println(countYZ("y2bz"));
        System.out.println(countYZ("DAY abc XYZ"));
        System.out.println(countYZ("aaz yyz my"));
    }
}