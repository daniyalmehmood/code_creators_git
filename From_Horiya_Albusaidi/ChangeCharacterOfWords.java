public class ChangeCharacterOfWords {
    public String replaceXWithY(String str) {
        if(str.contains("x")) return replaceXWithY(str.replace('x', 'y'));
        else return str;
    }
}
