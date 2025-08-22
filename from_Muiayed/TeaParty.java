public class TeaParty {

    public static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        if (tea >= 2 * candy || candy >= 2 * tea) return 2;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(teaParty(6, 8));  // 1
        System.out.println(teaParty(3, 8));  // 0
        System.out.println(teaParty(20, 6)); // 2
    }
}