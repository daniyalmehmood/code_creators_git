public class EveryOtherCharacter{
public static String getEveryOtherCharacter(String str) {
    String r ="";

    for (int i=0; i<str.length(); i+=2) {
        r= r + str.substring(i, i+1);
    }
    return r;
}
public static void main(String[] args) {
    System.out.println(getEveryOtherCharacter("Hello"));
    System.out.println(getEveryOtherCharacter("Hi"));
    System.out.println(getEveryOtherCharacter("Heeololeo"));
}
}