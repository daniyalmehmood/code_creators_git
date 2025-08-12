public class FrontTimes {
    public static String frontTimes(String str, int n) {
        String front;
        if(str.length() < 3){
            front = str;
        }
        else {
            front = str.substring(0,3);
        }
        StringBuilder newStr = new StringBuilder();
        for(int i = 0; i < n; i++){
            newStr.append(front);
        }
        return newStr.toString();
    }
    public static void main(String[] args) {

        System.out.println(frontTimes("Chocolate", 2));
        System.out.println(frontTimes("Chocolate", 3));
        System.out.println(frontTimes("Abc", 3));

    }
}
