public class FizzArrayGenerator {
    // Method to create an array containing numbers 0 to n-1
    public static int[] fizzArray(int n) {
        int[] result = new int[n]; 
        for (int i = 0; i < n; i++) {
            result[i] = i;
        }
        return result; 
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(fizzArray(4)));  
        System.out.println(java.util.Arrays.toString(fizzArray(1)));  
        System.out.println(java.util.Arrays.toString(fizzArray(10))); 
    }
}