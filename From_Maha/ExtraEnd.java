public class ExtraEnd {

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }

    public static void main(String[] args) {
        ExtraEnd obj = new ExtraEnd();

        System.out.println(obj.extraEnd("Hello"));  // output "lolo"
        System.out.println(obj.extraEnd("ab"));     // output "ababab"
        System.out.println(obj.extraEnd("Hi"));     // output "HiHiHi"
    }
}