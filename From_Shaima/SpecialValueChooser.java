public class SpecialValueChooser {
    public static int chooseBasedOnModFive(int a, int b) {
        if ( a<b && a%5 == b%5) return a; //return value of 'a' if is smaller and the two values have the same remainder when divided by 5
        if ( b<a && a%5 == b%5) return b; //return value of 'b' if is smaller and the two values have the same remainder when divided by 5
        if (a<b) return b; // 'b' is the largest
        if (b<a)return a; // 'a' is the largest
        return 0; //a==b
    }
    public static void main(String[] args){
        System.out.println(chooseBasedOnModFive(2,3));
        System.out.println(chooseBasedOnModFive(9,1));
    }
}
