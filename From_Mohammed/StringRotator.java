// Class for rotating strings
public class StringRotator {

    // Moves the first 2 characters to the end
    public String rotateLeft2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }
}

