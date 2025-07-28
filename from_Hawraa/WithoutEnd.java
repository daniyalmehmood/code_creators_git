public class WithoutEnd {

    public static String withoutEnd(String str) {
        String newStr = "";
        newStr = str.substring(1, str.length() -1);
        return newStr;
    }
    public static void main(String[] args){
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("java"));
        System.out.println(withoutEnd("coding"));
    }
}

