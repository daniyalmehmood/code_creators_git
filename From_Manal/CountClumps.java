//Array-3 > countClumps
public class CountClumps {
    public static int countClumps(int[] numbers) {
        int clumpCount = 0;   
        boolean inClump = false;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                // Found equal neighbors
                if (!inClump) {
                    clumpCount++;
                    inClump = true;
                }
            } else {
                inClump = false;
            }
        }

        return clumpCount;
    }

    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
    }
}