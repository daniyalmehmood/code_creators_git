public class StringExpander {

    // Creates a new string by adding parts of the input string step-by-step.

  // For example, if the input is "Code", it returns "CCoCodCode".

    public String buildProgressiveString(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.substring(0, i + 1);
        }
        return result;
    }
}
