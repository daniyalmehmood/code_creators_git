public class ExtraEnd {
    public String replicateStringEnding(String str) {
        if (str.length() >= 2) {
            return str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2);
        }
        return "length less than 2"; }


}


