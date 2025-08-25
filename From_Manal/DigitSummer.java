public class DigitSummer {
    // Method to sum digits in a string
    public static int sumDigits(String text) {
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                sum += ch - '0'; 
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));   
        System.out.println(sumDigits("aa11b33"));    
        System.out.println(sumDigits("Chocolate")); 
    }
}