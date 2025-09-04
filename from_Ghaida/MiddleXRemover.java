public class MiddleXRemover {
    public static void main(String[] args) {
        System.out.println(removeXFromMiddle("xxHxix")); //"xHix"
        System.out.println(removeXFromMiddle("abxxxcd")); //"abcd"
        System.out.println(removeXFromMiddle("xabxxxcdx")); //"xabcdx"
    }
    public static String removeXFromMiddle(String str) {
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
