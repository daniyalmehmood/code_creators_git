public class Double23 {
        public boolean double23(int[] nums) {
            if (nums.length != 2) return false;
            return (nums[0] == 2 && nums[1] == 2) ||
                    (nums[0] == 3 && nums[1] == 3);
        }

        public static void main(String[] args) {
            Double23 d = new Double23();
            System.out.println(d.double23(new int[]{2, 2}));
            System.out.println(d.double23(new int[]{3, 3}));
            System.out.println(d.double23(new int[]{2, 3}));
        }
    }
