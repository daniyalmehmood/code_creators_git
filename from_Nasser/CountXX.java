public class CountXX {

    public static int countXX(String str) {
        int count=0;
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)=='x' &&  str.charAt(i+1)=='x')
            count++;
        }

   return count; }

    public static void main(String[] args) {
        System.out.println(countXX("abcxx"));
        System.out.println(countXX("xxx"));
        System.out.println(countXX("xxxx"));
    }
}
