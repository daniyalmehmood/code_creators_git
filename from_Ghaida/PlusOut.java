public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy")); //"++xy++"
        System.out.println(plusOut("12xy34", "1")); //"1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy")); //"++xy++xy+++xy"
    }
    public static String plusOut(String str, String word) {
        StringBuilder newString = new StringBuilder();
        int CharOfStr = 0;
        while ( CharOfStr < str.length()) {
            if (str.startsWith(word, CharOfStr)){
                newString.append(word); //if str have word at CharOfStr, will be added to new string
                CharOfStr += word.length();//move to next index
            }
            else {
                newString.append('+');
                CharOfStr++;//move to next char
            }
        }
        return newString.toString();
    }
}
