public class ConCat {
    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat")); //"abcat"
        System.out.println(conCat("dog", "cat")); //"dogcat"
        System.out.println(conCat("abc", "")); //"abc"
    }
    public static String conCat(String a, String b) {
        if(a.isEmpty() || b.isEmpty()){
            return a + b;
        }
        else if(a.charAt(a.length() -1) == b.charAt(0)){
            return a + b.substring(1);
        }
        return a + b;
    }
}
