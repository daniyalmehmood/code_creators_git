public class LastChars {

    public static String lastChars(String a, String b) {



        if (a.isEmpty() && !b.isEmpty()){
            return "@"+ b.charAt(b.length()-1);
        } else if (b.isEmpty() && !a.isEmpty()) {
            return a.charAt(0) +"@";

        }
        else if (b.isEmpty() && a.isEmpty()){
            return "@"+"@";
        }
        else return (""+a.charAt(0) + b.charAt(b.length()-1));


    }

    public static void main(String[] args) {
        System.out.println(lastChars("",""));
    }

}
