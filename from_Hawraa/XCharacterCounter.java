// Recursion-1 > countX
public class XCharacterCounter {
    public int countCharX(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        if (str.charAt(0) == 'x'){
            return 1 + countCharX(str.substring(1));
        }
        return countCharX(str.substring(1));
    }
}