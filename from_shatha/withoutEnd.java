public class withoutEnd {
    public static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }
        public static void main(String[] args){
            System.out.println(withoutEnd("Hello"));
            System.out.println(withoutEnd("java"));
            System.out.println(withoutEnd("coding"));

        }
    }