public class FirstAndLastLetter {
    public static String backAround(String str) {




        String last = str.substring(str.length()-1);


        return last + str + last ;








    }

    public static void main(String[] args) {
        System.out.println(backAround("Jamal"));
    }

}
