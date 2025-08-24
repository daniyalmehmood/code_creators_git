public class StarRemovalProcessor {
    public static String removeStarsAndNeighbors(String str) {
        StringBuilder result = new StringBuilder(); // initialize a string builder to store the result
        for (int i=0 ; i<str.length();i++) { // use a for loop to go through the str
            if (!(str.charAt(i) =='*'|| (i>0 && str.charAt(i-1)=='*')||(i < str.length()-1 && str.charAt(i+1)=='*'))){
                result.append(str.charAt(i));
            }
        }
        return result.toString(); // return the final 'result'
    }
    public static void main(String[] args) {
        System.out.println(removeStarsAndNeighbors("ab**cd"));
    }
}
