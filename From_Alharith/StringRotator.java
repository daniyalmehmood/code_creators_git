public class StringRotator  {

    public String rotateRightByTwo(String str) {
        if (str.length()<2) return str;
        return str.substring(str.length()-2) + str.substring(0,str.length()-2 );
    }

}
