public class CharacterDuplicator{
    public String duplicateEachCharacter(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            result.append(currentChar).append(currentChar);
        }
        return result.toString();
    }
}