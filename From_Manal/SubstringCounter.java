//TRA-3893-Recursion-1/count11
public class SubstringCounter {

    // to count how many times "11" appears in the string
    
    public int countNonOverlapping11(String text) {
        // if the string has fewer than 2 characters, it can't contain "11"
        if (text.length() < 2) {
            return 0;
        }

        // If the string starts with "11", count it and skip the next char to avoid overlap
        if (text.startsWith("11")) {
            return 1 + countNonOverlapping11(text.substring(2));
        }

        // Otherwise, move one character forward and continue checking
        return countNonOverlapping11(text.substring(1));
    }

    
    public static void main(String[] args) {
        SubstringCounter counter = new SubstringCounter();

        System.out.println(counter.countNonOverlapping11("11abc11"));     
        System.out.println(counter.countNonOverlapping11("abc11x11x11")); 
        System.out.println(counter.countNonOverlapping11("111"));         
    }
}

