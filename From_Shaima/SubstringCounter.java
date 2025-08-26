public class SubstringCounter {
    public static int countHiOccurrences(String str) {
        int count =0; // initialize 'count' variable
        for (int i =0 ; i<str.length()-1; i++){ // use a for loop to go through each element
            if (str.charAt(i)=='h'&& str.charAt(i+1)=='i'){ // if the char at 'i' is 'h' and the followed element is 'i'
                count++; // increment the count value
            }
        }
        return count; // the output value of count
    }
    public static void main(String[] args) {
        System.out.println(countHiOccurrences("abc hi ho"));
    }
}
