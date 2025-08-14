public class TeaParty {
    public static int rateTeaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea >= candy * 2 || candy >= tea * 2) {
            return 2;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(rateTeaParty(6, 8));
        System.out.println(rateTeaParty(3, 8));
        System.out.println(rateTeaParty(20, 6));
    }
}
