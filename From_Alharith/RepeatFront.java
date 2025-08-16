public class RepeatFront {


    public String repeatFrontDecreasing(String str, int n) {
        StringBuilder result= new StringBuilder();

        for (int i=0; i<n;i++ ){

            result.append(str.substring(0,n-i));

        }
        return result.toString();
    }
}
