public class CountRepeatedCharacter {
    public static int countDoubleX(String str) {
        int count = 0; // initialize  'count' variable and assign 0 to its
        for (int i = 0;i < str.length()-1; i++) // using a for loop to go through each char in the string
        {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') //  check if the char in the string is 'x' followed by another 'x'
            {
                count++; // update the 'count' value
            }
        }
        return count; // return the lastest value of 'count'
    }
    public static void main (String[]args){
        System.out.println(countDoubleX("abcxx"));
        System.out.println(countDoubleX("xxx"));
        System.out.println(countDoubleX("xxxx"));
    }
}
