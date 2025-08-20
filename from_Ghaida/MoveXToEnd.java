public class MoveXToEnd {//Recursion-1 > endX
    public static void main(String[] args) {
        System.out.println(pushXToEnd("xxre"));// → "rexx"
        System.out.println(pushXToEnd("xxhixx"));// → "hixxxx"
        System.out.println(pushXToEnd("xhixhix"));// → "hihixxx"
    }
    public static String pushXToEnd(String str) {
        if(str.isEmpty()){
            return str;
        }
        if(str.charAt(0) == 'x'){
            return pushXToEnd(str.substring(1)) + 'x';
        }
        return str.charAt(0) + pushXToEnd(str.substring(1));
    }
}