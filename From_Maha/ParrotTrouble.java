public class ParrotTrouble {
    
    public static boolean isParrotCausingTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static void main(String[] args) {
        System.out.println(isParrotCausingTrouble(true, 6)); // Output: true
    }
}
