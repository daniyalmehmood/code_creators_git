 import java.util.Arrays;
public class ArrayStringGenerator {
    public static String[] createStringNumberArray(int n) {
        String[] result = new String[n];
        for (int i=0 ; i < n ; i++){
            result[i] = String.valueOf(i);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createStringNumberArray(4)));
    }
}
