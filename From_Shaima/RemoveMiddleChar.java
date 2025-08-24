public class RemoveMiddleChar {
    public static String removeMiddelCharX(String str) {
        if (str.length()<=2) // check the length of 'str' is it 2 or less
        {
            return str; // return the same input if the condition is true
        }
        StringBuilder result = new StringBuilder(); // Create a StringBuilder object to build the final result 'result'
        result.append(str.charAt(0)); // to add the first character in the input to the builder

        for (int i = 1; i < str.length()-1; i++)  // Use a for-loop to go through each character in the 'str' starting from index 1 and stops 1 element before the last character
        {
            if (str.charAt(i) !='x')  // if the character is not 'x'
            {
                result.append(str.charAt(i)); // put the character that is not 'x' in 'result'
            }
        }
        result.append(str.charAt(str.length()-1)); //to add the last character in the input to the builder after removing all 'x' from middle
        return result.toString(); // return the final result
    }
    public static void main(String[] args) {
        System.out.println(removeMiddelCharX("xxHxix"));
        System.out.println(removeMiddelCharX("abxxxcd"));
        System.out.println(removeMiddelCharX("xabxxxcdx"));
    }
}