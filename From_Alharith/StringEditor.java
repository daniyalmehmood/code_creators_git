public class StringEditor  {
    public String removeCharacterAtIndex(String str, int n) {
        String front= str.substring(0,n);
        String back= str.substring(n+1);

        return front+back ;

    }
}
