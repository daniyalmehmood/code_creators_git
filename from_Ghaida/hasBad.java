public class hasBad {
    public static void main(String[] args){
        System.out.println(hasBad("badxx"));// → true
        System.out.println(hasBad("xbadxx")); // → true
        System.out.println(hasBad("xxbadxx")); // → false
    }
    public static boolean hasBad(String str) {
        if(str.length() < 3){
            return false;
        }
        if(str.startsWith("bad")){
            return true;
        }
        if(str.length() > 3 && str.substring(1, 4).equals("bad")) {
            return true;
        }
        return false;
    }
}
