public class AltPairs {
    public static void main(String[] args) {
        System.out.println(pickTwoSkipTwo("kitten")); //"kien"
        System.out.println(pickTwoSkipTwo("Chocolate")); //"Chole"
        System.out.println(pickTwoSkipTwo("CodingHorror")); //"Congrr"
    }
    public static String pickTwoSkipTwo(String str) {
        StringBuilder firstTwoIndex = new StringBuilder();
        for(int i = 0; i < str.length(); i += 4){
            firstTwoIndex.append(str.charAt(i));
            if(i + 1 < str.length()){
                firstTwoIndex.append(str.charAt(i+1));
            }
        }
        return firstTwoIndex.toString();
    }
}