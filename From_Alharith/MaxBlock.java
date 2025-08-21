public class MaxBlock {

    public int largestCharBlock(String str) {

        int count=1;
        int countLargest=0;

        for (int i=0; i<str.length()-1; i++){

            if (str.charAt(i)==str.charAt(i+1)){
                count++;

            }
            else count=1;
            if (countLargest<=count) {
                countLargest=count;
            }


        }
        return countLargest;
    }

}
