public class FizzArrayTwo {

    public String[] createStringSequenceArray(int n) {

        String[] result= new String[n];
        for (int i=0; i<n; i++){
            result[i]= String.valueOf(i);
        }
        return result;
    }
}
