public class RepeatingString{


     // Returns a new string that repeats the input string n times.

    public String repeatString(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + str;
        }
        return result;
    }
}
