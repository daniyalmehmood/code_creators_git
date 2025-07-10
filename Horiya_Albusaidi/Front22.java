public class Front22 {
    public static String front22(String str)
    {
        String newString = "";
        if(str.length()>2){
            char firstChar = str.charAt(0);
            char SecondChar = str.charAt(1);
            String addString=firstChar+""+SecondChar;
            newString = addString+str+addString;
            return newString;
        }
        else {
            return str.repeat(3);
        }

    }
}
