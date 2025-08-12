public class CatDog {
    public static void main(String[] args) {
        System.out.println(catDog("catdog")); //true
        System.out.println(catDog("catcat")); //false
        System.out.println(catDog("1cat1cadodog")); //true
    }
    public static boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if(str.substring(i, i + 3).equals("cat")){
                countCat++;
            }
            if(str.substring(i, i + 3).equals("dog")){
                countDog++;
            }
        }
            return countCat == countDog;
    }
}
