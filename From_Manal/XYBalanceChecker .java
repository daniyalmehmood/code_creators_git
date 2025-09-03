public class XYBalanceChecker {
    public static boolean isXYBalanced(String text) {
        // Find the position of the last 'x'
        int lastXPosition = text.lastIndexOf('x');
        // Find the position of the last 'y'
        int lastYPosition = text.lastIndexOf('y');
        return lastXPosition == -1 || lastYPosition > lastXPosition;
    }
    public static void main(String[] args) {
        System.out.println(isXYBalanced("aaxbby"));  
        System.out.println(isXYBalanced("aaxbb"));   
        System.out.println(isXYBalanced("yaaxbb")); 
    }
}