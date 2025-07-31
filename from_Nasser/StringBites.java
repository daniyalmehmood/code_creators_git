public class StringBites {

    public static String stringBits(String str) {
        StringBuilder string1=new StringBuilder();
        char[] chara=str.toCharArray();
        for ( int i=0;i<chara.length;i+=2){

            string1.append(chara[i]);
        }
        return string1.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringBits("hello"));
        System.out.println(stringBits("h"));
        System.out.println(stringBits("heeololeo"));
    }

}
