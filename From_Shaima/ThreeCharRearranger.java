public class ThreeCharRearranger {
    public static String rearrangeOneTwo(String str) {
        StringBuilder result= new StringBuilder();
        if (str.length()<=2){
            return "";
        }
    for (int i=0 ; i < str.length()-2 ; i+=3){
        result.append(str.charAt(i+1));
        result.append(str.charAt(i+2));
        result.append(str.charAt(i));
   }
    return result.toString();
    }
    public static void main(String[] args) {
        System.out.println(rearrangeOneTwo("abc"));
        System.out.println(rearrangeOneTwo("tcagdo"));
    }
}
