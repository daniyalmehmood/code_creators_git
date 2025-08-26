public class BrickBuilder {
    public static boolean makeBricks(int small, int big, int goal) {
        if (goal > big*5 + small) return false;
        if (goal %5 > small) return false;

        return true;

    }
    public static void main(String[] args) {
        System.out.println(makeBricks(3, 1, 8));
        System.out.println(makeBricks(3, 1, 9));
        System.out.println(makeBricks(3, 2, 10));
    }
}
