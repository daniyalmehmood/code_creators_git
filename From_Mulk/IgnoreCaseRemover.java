public class IgnoreCaseRemover {
    public String removeSubstringIgnoreCase(String base, String remove) {

        String baseLower = base.toLowerCase();
        String removeLower = remove.toLowerCase();
        StringBuilder result = new StringBuilder(base);

        int index = 0;
        while (baseLower.contains(removeLower)) {
            index = baseLower.indexOf(removeLower);
            result.delete(index, index + remove.length());


            baseLower = result.toString().toLowerCase();
        }

        return result.toString();
    }
}
