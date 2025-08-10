public class StringRemover {
    public String removeSubstring(String base, String remove) {
        remove = remove.toLowerCase();
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < base.length(); i++) {
            if (i <= base.length() - remove.length()) {
                String comparedPart = (base.substring(i, i + remove.length())).toLowerCase();
                if (comparedPart.equals(remove)) {
                    i += remove.length() - 1;
                    continue; //Skip the rest of the code inside the loop
                }
            }
            finalString.append(base.charAt(i));
        }
        return finalString.toString();
    }
}