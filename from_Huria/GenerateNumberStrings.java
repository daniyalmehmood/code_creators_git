import java.util.Arrays;

public class GenerateNumberStrings {
    public static String[] fizzArrayStrings(int n) {
        String fizzArray2[] = new String[n];
        for(int i=0; i<n ; i++){
            fizzArray2[i] = String.valueOf(i);
        }
        return fizzArray2;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArrayStrings(4)));
        System.out.println(Arrays.toString(fizzArrayStrings(10)));
        System.out.println(Arrays.toString(fizzArrayStrings(2)));
    }
}
