public class AltPairs {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten")); //"kien"
        System.out.println(altPairs("Chocolate")); //"Chole"
        System.out.println(altPairs("CodingHorror")); //"Congrr"
    }
    public static String altPairs(String str) {
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