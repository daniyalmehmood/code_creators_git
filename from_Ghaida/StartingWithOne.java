public class StartingWithOne {
    public static void main(String[] args) {
        System.out.println(isStartsWithOne(new int[]{1, 2, 3}, new int[]{1, 3})); //2
        System.out.println(isStartsWithOne(new int[]{7, 2, 3}, new int[]{1})); //1
        System.out.println(isStartsWithOne(new int[]{1, 2}, new int[]{})); //1
    }
    public static int isStartsWithOne(int[] a, int[] b) {
        int countArraysHaveOne = 0;
        if(a.length > 0 && a[0] == 1){
            countArraysHaveOne++;
        }
        if(b.length > 0 && b[0] == 1){
            countArraysHaveOne++;
        }
        return countArraysHaveOne;
    }
}
