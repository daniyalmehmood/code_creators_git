public class ClearNextValue {
    public static String stringBits(String str) {

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < str.length();i++){
            if (i%2==0){
                sb = sb.append(str.charAt(i));
            }


        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringBits("Heeelllooo"));
    }

}
