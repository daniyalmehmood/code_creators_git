public class StringX {
    public static String stringX(String str) {
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            if(!(i > 0 && i < (str.length() - 1) && str.substring(i, i+1).equals("x"))){
                newStr = newStr + str.substring(i, i+1);
            }
        }
        return newStr;
    }

    public static void main(String[] args){
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
}
