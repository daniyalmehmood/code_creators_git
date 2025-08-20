public class StringRightRotator {

    // Puts last 2 characters at the front

    public String moveLastTwoToFront(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }
}
