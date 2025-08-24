//Array-2 > fizzArray3 Task
import java.util.Arrays;
public class FizzArrayThree {
    public static int[] fizzArrayThree(int start, int end) {
        int length = end - start;          
        int[] result = new int[length];  

        for (int i = 0; i < length; i++) {
            result[i] = start + i;        
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fizzArrayThree(5, 10)));  
        System.out.println(Arrays.toString(fizzArrayThree(11, 18))); 
        System.out.println(Arrays.toString(fizzArrayThree(1, 3)));    
        System.out.println(Arrays.toString(fizzArrayThree(4, 4)));    
    }
}