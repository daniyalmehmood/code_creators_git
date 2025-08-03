public class Last2 {
    public int countRepeatingLast2(String str) {
        int countX = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 2).equals(str.substring(str.length() - 2))) {
                countX++;
            }
        }
        return countX;
    }

}