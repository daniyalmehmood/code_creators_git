public class DoubleX {

    public static boolean doubleX(String str) {

        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i) == 'x' && str.charAt(i + 1) != 'x'){
                return false;
            }
            if (str.charAt(i)=='x' && str.charAt(i+1)=='x'){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(doubleX("xxxx"));
        System.out.println(doubleX("xdfrg"));
        System.out.println(doubleX("xdxxg"));



    }

}
