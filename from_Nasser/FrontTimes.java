public class FrontTimes {

    public static String frontTimes(String str, int n) {
        StringBuilder string1=new StringBuilder();
        if(str.length()<=3){
            return str+str+str;
        }

        string1.append(str.charAt(0));
        string1.append(str.charAt(1));
        string1.append(str.charAt(2));

        return string1.toString().repeat(n);
    }

    public static void main(String[] args) {
        System.out.println(frontTimes("ad",4));

    }


}
