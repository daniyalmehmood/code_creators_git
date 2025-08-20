// Class for repeating front characters
public class FrontRepeater {

    // Returns first 2 chars (or whole string if shorter) repeated 3 times
    public String repeatFront(String str) {
        String front = str.length() >= 2 ? str.substring(0, 2) : str;
        return front + front + front;   // could also use front.repeat(3) in Java 11+
    }
}
