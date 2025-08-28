public class MaxBlock {
    public static void main(String[] args) {
        MaxBlock mb = new MaxBlock();
        System.out.println(mb.maxBlock("hoopla"));
        System.out.println(mb.maxBlock("abbCCCddBBBxx"));
        System.out.println(mb.maxBlock(""));
    }

    public int maxBlock(String str) {
        if (str.length() == 0) return 0;
        int max = 1;
        int current = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                current++;
                if (current > max) max = current;
            } else {
                current = 1;
            }
        }
        return max;
    }
}