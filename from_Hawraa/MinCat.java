public class MinCat {
    public static String minCat(String a, String b) {
        if(a.length() > b.length()){
            a = a.substring(a.length() - b.length());
        }
        else if (a.length() < b.length()){
            b = b.substring(b.length() - a.length());
        }
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(minCat("Hello", "Hi"));
        System.out.println(minCat("Hello", "java"));
        System.out.println(minCat("java", "Hello"));
    }
}
