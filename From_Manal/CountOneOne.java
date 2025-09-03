public class CountOneOne {
    public static int countOneOne(String str) {
        if(str.length()<2){
            return 0;
        }
        if(str.substring(0,2).equals("11")){
            return 1+ countOneOne(str.substring(2));
        }
        return countOneOne(str.substring(1));
    }


    public static void main(String[] args) {
        System.out.println(countOneOne("11abc11"));
        System.out.println(countOneOne("abc11x11x11") );
        System.out.println(countOneOne("111") );
    }
    }
