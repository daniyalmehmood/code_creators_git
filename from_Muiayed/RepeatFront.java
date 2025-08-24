public class RepeatFront {
    public String repeatFront(String str, int n) {
        StringBuilder out = new StringBuilder();
        for (int k = n; k > 0; k--) {
            out.append(str.substring(0, k));
        }
        return out.toString();
    }

    public static void main(String[] args) {
        RepeatFront rf = new RepeatFront();
        System.out.println(rf.repeatFront("Chocolate", 4));
        System.out.println(rf.repeatFront("Chocolate", 3));
        System.out.println(rf.repeatFront("Ice Cream", 2));
    }
}