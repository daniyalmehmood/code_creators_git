public class EndsLy {
    public boolean endsWithLy(String str) {
        if (str.isEmpty()) {
            return false;
        }
        if (str.length() >= 2 && str.substring(str.length() - 2).equals("ly")) {
            return true;
        } else {
            return false;
        }
    }
}

