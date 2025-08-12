public class MinCat {
    public static String equalLengthConcat(String a, String b) {
        if(a.length() > b.length()){
            a = a.substring(a.length() - b.length());
        }
        else if (a.length() < b.length()){
            b = b.substring(b.length() - a.length());
        }
        return a + b;
    }

    public static void main(String[] args){
        System.out.println(equalLengthConcat("Hello", "Hi"));
        System.out.println(equalLengthConcat("Hello", "java"));
        System.out.println(equalLengthConcat("java", "Hello"));
    }
}
