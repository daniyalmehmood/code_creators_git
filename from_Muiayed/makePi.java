public class makePi {
    public int[] makePi() {
        return new int[]{3, 1, 4};
    }


    public static void main(String[] args) {
        makePi mp = new makePi();
        int[] pi = mp.makePi();
        System.out.println(pi[0] + " " + pi[1] + " " + pi[2]);
    }
}