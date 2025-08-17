public class RepeatEnd {

    public String repeatLastNChars(String str, int n) {

        StringBuilder result= new StringBuilder();

        for (int i=0 ; i<=n-1; i++){

            result.append(str.substring((str.length()-n)));
        }
        return result.toString();
    }

}
