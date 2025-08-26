public class CharPairsCounter {//Recursion-1 > countPairs
    public static void main(String[] args) {
        System.out.println(countPairsInString("axa")); //1
        System.out.println(countPairsInString("axax")); //2
        System.out.println(countPairsInString("axaxa")); //3
    }
    public static int countPairsInString(String str) {
        if(str.length() <= 2){
            return 0;
        }
        if(str.charAt(0) == str.charAt(2)){
            return 1 + countPairsInString(str.substring(1));
        }
        return countPairsInString(str.substring(1));
    }   
}