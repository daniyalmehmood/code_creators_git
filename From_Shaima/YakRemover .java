public class YakRemover  {
    public static String removeYakPattern(String str) {
        StringBuilder newStr = new StringBuilder(); // Create a StringBuilder object to build the final result 'newStr'
        for (int i = 0; i < str.length(); i++) // Use a for-loop to go through each character in the 'str'
        {
            if (i+2< str.length() && str.charAt(i) =='y'&& str.charAt(i + 2) == 'k')  // Check if the index value is 'y' and the value of index+2 is 'k'
            {
                i+=2; // to skip 2 character from 'i'. // e.g str.charAt(0)=y &&  str.charAt(2)=k .
            }
            else{
                newStr.append(str.charAt(i)); // to add the character that is not 'y' or 'k' to the builder
            }
        }
        return newStr.toString(); // return the output 'newStr' after converting the StringBuilder to String
    }
    public static void main(String[] args) {
        System.out.println(removeYakPattern("yakpak"));
        System.out.println(removeYakPattern("y1kpak"));
    }
}
