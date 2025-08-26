public class CountXX {

    public static int CountingXs(String str) {
        int count=0;
        for (int i=0;i<str.length()-1;i++){
            if (str.charAt(i)=='x' &&  str.charAt(i+1)=='x')
            count++;
        }

   return count; }

    public static void main(String[] args) {
        System.out.println(CountingXs("abcxx"));
        System.out.println(CountingXs("xxx"));
        System.out.println(CountingXs("xxxx"));
    }
}
