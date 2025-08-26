public class DoubleOneCounter {//Recursion-1 > count11
    public static void main(String[] args) {
        System.out.println(countDoubleOnes("11abc11")); //2
        System.out.println(countDoubleOnes("abc11x11x11")); //3
        System.out.println(countDoubleOnes("111")); //1
    }
    public static int countDoubleOnes(String str) {
        if(str.length() <= 1){
            return 0;
        }
        if(str.substring(0, 2).equals("11")){
            return 1 + countDoubleOnes(str.substring(2));
        }
        return countDoubleOnes(str.substring(1));
    }
}