public class PlusTwo {
    public int[] plusTwo(int[] a, int[] b) {
        return new int[]{a[0], a[1], b[0], b[1]};
    }

    public static void main(String[] args) {
        PlusTwo pt = new PlusTwo();
        int[] out = pt.plusTwo(new int[]{1, 2}, new int[]{3, 4});
        System.out.println(out[0] + " " + out[1] + " " + out[2] + " " + out[3]);
    }
}

