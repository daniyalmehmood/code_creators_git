public class countXX {
    public static void main(String[] args) {
        System.out.println(countXX("abcxx")); //1
        System.out.println(countXX("xxx")); //2
        System.out.println(countXX("xxxx")); //3
    }

    public static int countXX(String str) {
        int count = 0;
        for(int i= 0; i < str.length() - 1; i++){
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
            }
        return count;
    }
}
