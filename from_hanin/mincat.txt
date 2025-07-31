public class SubstringMerger {
    public String mergeSameLength(String a, String b) {
        int Alen = a.length();
        int Blen = b.length();
        if( Alen >Blen ){ return  a.substring(a.length()-Blen) + b;}
        if( Alen < Blen ){ return a +b.substring(b.length()-Alen) ;}
        if(Alen == Blen) { return a+b;}
        return "";
    }


}
