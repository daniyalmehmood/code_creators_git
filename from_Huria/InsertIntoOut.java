public class InsertIntoOut {
    public static String insertIntoOut(String out, String word) {
        String firstStr = out.substring(0, 2);
        String secondStr = out.substring(2, 4);
        
        return firstStr + word + secondStr;
    }

    public static void main(String[] args) {

        System.out.println(InsertIntoOut.insertIntoOut("<<>>", "Yay"));
        System.out.println(InsertIntoOut.insertIntoOut("<<>>", "WooHoo"));
        System.out.println(InsertIntoOut.insertIntoOut("[[]]", "word"));
        System.out.println(InsertIntoOut.insertIntoOut("HHoo", ""));
    }
}
