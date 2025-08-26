public class CharacterSelector {
    public static void main(String[] args){
        System.out.println(getCharacterFromEnd("Hello", true)); // → "H"
        System.out.println(getCharacterFromEnd("Hello", false)); // → "o"
        System.out.println(getCharacterFromEnd("oh", true)); // → "o"
    }
    public static String getCharacterFromEnd(String str, boolean front) {
        if(front){
            str = str.substring(0, 1);
            return str;
        }
        else{
            str = str.substring(str.length() - 1);
            return str;
        }
    }
}
