public class CharacterPatternChecker {
    public static boolean hasDoubleX(String str) {
        for (int i = 0; i < str.length()-1; i++) // using a for loop to go through each char in the string
        {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x' ) //check if the char in the 'str' is x followed by another x
            {
                return true; //return true while accept the condition
            }
        }
        return false; //return false while the condition is not acceptable
    }
    public static void main (String[]args) {
        System.out.println(hasDoubleX("axxbb"));
        System.out.println(hasDoubleX("axaxax"));
        System.out.println(hasDoubleX("xxxxx"));
        System.out.println(hasDoubleX("xaxxx"));
        System.out.println(hasDoubleX("aaaax"));
        System.out.println(hasDoubleX(""));
        System.out.println(hasDoubleX("ABC"));
        System.out.println(hasDoubleX("x"));
        System.out.println(hasDoubleX("xx"));
        System.out.println(hasDoubleX("xax"));
        System.out.println(hasDoubleX("xaxx"));
    }
}
