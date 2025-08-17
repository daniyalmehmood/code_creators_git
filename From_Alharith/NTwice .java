public class NTwice   {

    public String combineStartAndEnd(String str, int n) {
        String first= str.substring(0,n);
        String end = str.substring(str.length()-n);
        return (first+end);
    }

}
