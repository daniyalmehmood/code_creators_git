public class CountYZ {
    public static int countYOrZEnds(String str) {
        str = str.toLowerCase();
        int countYAndZ = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'y' || str.charAt(i) == 'z'){
                if(i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))){
                    countYAndZ++;
                }
            }
        }
        return countYAndZ;
    }

    public static void main(String[] args){
        System.out.println(countYOrZEnds("fez day"));
        System.out.println(countYOrZEnds("day fez"));
        System.out.println(countYOrZEnds("day fyyyz"));
    }
}
