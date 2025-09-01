public class ToRemoveString {
        public static String withoutString(String base, String remove) {
            String lowerBase = base.toLowerCase();
            String lowerRemove = remove.toLowerCase();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < lowerBase.length(); i++) {
                if (i <= lowerBase.length() - lowerRemove.length()) {
                    String subString = lowerBase.substring(i, i + lowerRemove.length());

                    if (!subString.equals(lowerRemove)) {
                        result.append(base.substring(i, i + 1));
                    } else {
                        i += lowerRemove.length() - 1;  // skip the removed word
                    }
                } else {
                    result.append(base.substring(i, i + 1));  // preserve casing for last characters
                }
            }

            return result.toString();
        }
    }


