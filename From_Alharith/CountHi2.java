public class CountHi2 {

    public int countHi2(String str) {
        if (str.length()<2) return 0;
        int add=0;
        if (str.substring(str.length()-2).equals("hi")){
            if (str.length()<=2 || str.charAt(str.length()-3)!='x') add=1;
        }
        return add + countHi2(str.substring(0,str.length()-1));
    }

}
