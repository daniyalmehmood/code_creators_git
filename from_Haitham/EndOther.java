public class EndOther {
public boolean endOtherChecker(String a, String b) {
        if (a.length() > b.length()) {
            if (a.toLowerCase().substring(a.length() - b.length()).equals(b.toLowerCase())) return true;

        } else {
            if (b.toLowerCase().substring(b.length() - a.length()).equals(a.toLowerCase())) return true;
        }
        return false;

    }
	}