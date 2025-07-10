public class LoneTeen {
    public static boolean loneTeen(int a, int b) {
        return (a <= 19 && a >= 13) ^ (b >= 13 && b <= 19);
    }
}
