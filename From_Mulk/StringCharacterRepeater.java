public class StringCharacterRepeater {
    public String repeatCharactersTwice(String str) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char character = str.charAt(i);
            newString.append(character).append(character);
        }
        return newString.toString();
    }

}