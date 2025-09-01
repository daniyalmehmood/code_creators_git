public class XCleanString {
    String deleteX(String str) {
        if (str.length() == 0) {
            return "";
        }
        char first = str.charAt(0);
        String rest = str.substring(1);
        if (first == 'x') {
            return deleteX(rest);
        } else {
            return first + deleteX(rest);
        }
    }

}


