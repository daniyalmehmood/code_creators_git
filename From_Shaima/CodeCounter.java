public class CodeCounter {
    public static int countCoe(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) { // use for loop to go through the string
                if(str.charAt(i)=='c'&&str.charAt(i+1)=='o'&&str.charAt(i+3)=='e') //check if there is co'x'e in series
                count++; //+1 to count
            }
        return count; // return the value of count
    }

    public static void main(String[] args) {
        System.out.println(countCoe("aaacodebbb"));
        System.out.println(countCoe("aaacopebbb"));
    }
}
