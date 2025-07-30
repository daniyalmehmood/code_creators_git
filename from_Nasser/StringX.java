public class StringX {
    public static String stringX(String str) {
        StringBuilder string1=new StringBuilder();
        if (str.length()<=2){
            return str;
        }
        string1.append(str.charAt(0));

        for (int i=1;i< str.length()-1;i++){

            if(str.charAt(i)=='x'){
                continue;
            }
            string1.append(str.charAt(i));
        }
        string1.append(str.charAt(str.length()-1));

        return string1.toString();
    }

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }


}
