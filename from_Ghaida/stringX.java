public class stringX {
    public static void main(String[] args) {
        System.out.println(stringX("xxHxix")); //"xHix"
        System.out.println(stringX("abxxxcd")); //"abcd"
        System.out.println(stringX("xabxxxcdx")); //"xabcdx"
    }
    public static String stringX(String str) {
        if (str.length() <= 2){
            return str;
        }
        StringBuilder newString = new StringBuilder();
        newString.append(str.charAt(0));
        for(int i = 1; i <str.length() - 1; i++){
            if(str.charAt(i) != 'x'){
                newString.append(str.charAt(i));
            }
        }
        newString.append(str.charAt(str.length() - 1));
        return newString.toString();
    }
}
