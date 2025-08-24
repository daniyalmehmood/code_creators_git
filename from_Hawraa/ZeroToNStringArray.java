import java.util.Arrays;

// Array-2 > fizzArray2
public class ZeroToNStringArray {
    public static String[] generateStringArray(int n) {
        String[] result = new String[n];
        for (int i = 0; i < n; i++){
            result[i] = ""+ i +"";
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(generateStringArray(4)));
        System.out.println(Arrays.toString(generateStringArray(10)));
        System.out.println(Arrays.toString(generateStringArray(2)));
    }
}
