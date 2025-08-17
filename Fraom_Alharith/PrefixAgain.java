public class PrefixAgain {

    public boolean isPrefixRepeated(String str, int n) {


        String prefix= str.substring(0,n);

        for (int i=n; i<str.length()-n+1; i++){
            if (str.substring(i,i+n).equals(prefix)) return true;
        }
        return false;
    }

}
