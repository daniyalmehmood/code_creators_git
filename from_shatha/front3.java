public class front3{
    public static void main(String[] args) {
        System.out.println(front3("java"));  
        System.out.println(front3("chocolate"));     
        System.out.println(front3("abc"));    
    }

    public static String front3(String str) {
        String Front;
        String newString;

        if (str.length() < 3) {
            Front = str;
        } else {
            Front = str.substring(0, 3);
        }

        newString = Front + Front + Front;

        return newString;
    }
}