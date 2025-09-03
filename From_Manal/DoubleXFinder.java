public class DoubleXFinder {
    //this function check if 'X' is followed by another 'X'
   public static boolean hasDoubleX(String str) {
        int index= str.indexOf("x");
        if ( str.length() <= index + 1){
            return false;
        }

        return str.charAt(index +1)== 'x';
    }

    public static void main(String[] args) {
        System.out.println(hasDoubleX("axxbb"));
        System.out.println(hasDoubleX("axaxax"));
        System.out.println(hasDoubleX("xxxxx"));
    }