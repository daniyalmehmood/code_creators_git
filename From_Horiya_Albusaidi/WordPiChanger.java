public class WordPiChanger {
    public String changePiToNumbers(String str) {
        if (str.contains("pi")) return changePiToNumbers(str.replace("pi", "3.14"));
        else return str;
    }

}
