public class StringGrowth {
    public static String generateStringGrowth(String str)
    {
        StringBuilder growthBuilder= new StringBuilder(); // Create a StringBuilder object to build 'growthBuilder' variable
        for (int i = 0; i < str.length(); i++)  // Use a for-loop to go through each character in 'str'
        {
            growthBuilder.append(str,0,i+1);  // add the 'str' substring from the first element until the element of 'i' to the 'growthBuilder'
        }
        return growthBuilder.toString(); // return the final output after converted to string
    }
    public static void main(String[] args) {
        System.out.println(generateStringGrowth("code"));
        System.out.println(generateStringGrowth("ABC"));
        System.out.println(generateStringGrowth("ab"));
    }
}
