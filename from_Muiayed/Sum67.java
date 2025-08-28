public class Sum67{
    public static int Sum67(int[] nums) {
        int sum = 0;
        boolean inSection = false;

        for (int num : nums) {
            if (num == 6) {
                inSection = true;
            } else if (num == 7 && inSection) {
                inSection = false;
            } else if (!inSection) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test1 = {1, 2, 2};
        int[] test2 = {1, 2, 2, 6, 99, 99, 7};
        int[] test3 = {1, 1, 6, 7, 2};
        int[] test4 = {6, 1, 2, 3, 7, 9};

        System.out.println(Sum67(test1));
        System.out.println(Sum67(test2));
        System.out.println(Sum67(test3));
        System.out.println(Sum67(test4));
    }
}