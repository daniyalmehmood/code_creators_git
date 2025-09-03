public class DoubleXCounter {
    public static int countDoubleX(String str) {

        int count = 0;
        for(int i=0; i< str.length()-1; i++){
            if(str.substring(i, i+2).equals("xx")) c++;

        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countDoubleX("abcxx")); //1
        System.out.println(countDoubleX("xxx") ); //2
        System.out.println(countDoubleX("xxxx")); //3
    }
}
