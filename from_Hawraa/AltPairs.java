public class AltPairs {
    public static String altPairs(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i+=4){
            int strCh = i + 2;
            if(strCh > str.length()){
                strCh = str.length();
            }
            newStr = newStr + str.substring(i, strCh);
        }
        return newStr;
    }
    public static void main(String[] args){
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }
}
