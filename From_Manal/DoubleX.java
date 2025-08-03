public class DoubleXFinder {
    //this function check if 'X' is followed by another 'X'
   public static boolean hasDoubleX(String str) {
        int index= str.indexOf("x");
        if (index== -1 || index +1>=str.length()){
            return false;
        }

        return str.charAt(index +1)== 'x';
    }

    public static void main(String[] args) {
        System.out.println(hasDoubleX("axxbb"));
        System.out.println(hasDoubleX("axaxax"));
        System.out.println(hasDoubleX("xxxxx"));
    }