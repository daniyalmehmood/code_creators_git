public class XtoYTransformer {//Recursion-1 > changeXY
    public static void main(String[] args) {
        System.out.println(replaceXWithY("codex"));// → "codey"
        System.out.println(replaceXWithY("xxhixx"));// → "yyhiyy"
        System.out.println(replaceXWithY("xhixhix"));// → "yhiyhiy"
    }
    public static String replaceXWithY(String str) {
        if (str.isEmpty()) {
            return str;
        }
        if (str.charAt(0) == 'x') {
            return 'y' + replaceXWithY(str.substring(1));
        }
        return str.charAt(0) + replaceXWithY(str.substring(1));
    }
}