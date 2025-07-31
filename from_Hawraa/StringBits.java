public class StringBits {
    public static String stringBits(String str) {
        String newStr = "";
        for (int i =0; i<str.length(); i+=2){
            newStr = newStr + str.substring(i, i+1);
        }
        return newStr;
    }
    public static void main(String[] args){
        System.out.println(stringBits("Hello"));
        System.out.println(stringBits("Hi"));
        System.out.println(stringBits("Heeololeo"));
    }
}
