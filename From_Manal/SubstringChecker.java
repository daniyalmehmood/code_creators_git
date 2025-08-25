public class SubstringChecker {

    // to check if "sub" appears at least n times in "text"
    public boolean hasAtLeastNCopies(String text, String sub, int n) {
        //  if we already found enough copies
        if (n == 0) {
            return true;
        }

        // if text is too short to contain "sub"
        if (text.length() < sub.length()) {
            return false;
        }

        
        if (text.startsWith(sub)) {
            // Decrease n and move one character forward (allow overlaps)
            return hasAtLeastNCopies(text.substring(1), sub, n - 1);
        } else {
            // Otherwise, move one character forward without decreasing n
            return hasAtLeastNCopies(text.substring(1), sub, n);
        }
    }

    public static void main(String[] args) {
        SubstringChecker checker = new SubstringChecker();

        System.out.println(checker.hasAtLeastNCopies("catcowcat", "cat", 2)); 
        System.out.println(checker.hasAtLeastNCopies("catcowcat", "cow", 2)); 
        System.out.println(checker.hasAtLeastNCopies("catcowcat", "cow", 1)); 
    }
}