public class XRemover {//Recursion-1 > noX
    public static void main(String[] args) {
        System.out.println(RemoveX("xaxb"));// → "ab"
        System.out.println(RemoveX("abc"));// → "abc"
        System.out.println(RemoveX("xx"));// → ""
    }
    public static String RemoveX(String str) {
        if(str.isEmpty()){
            return str;
        }
        if(str.charAt(0) == 'x'){
            return RemoveX(str.substring(1));
        }
        return  str.charAt(0) + RemoveX(str.substring(1));
    }
}