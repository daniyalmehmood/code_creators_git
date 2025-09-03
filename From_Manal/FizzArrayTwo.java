//Array-2 > fizzArray2
import java.util.Arrays;
public class FizzArrayTwo {
    public static String[] fizzArrayTwo(int n) {
        String [] arrayfizz=new String [n];
        for(int i=0; i<n; i++) {
            String str= String.valueOf(i);
            arrayfizz[i]=str;
        }
        return arrayfizz;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArrayTwo(4)));
        System.out.println(Arrays.toString(fizzArrayTwo(10)));
        System.out.println(Arrays.toString(fizzArrayTwo(2)));
    }
    }