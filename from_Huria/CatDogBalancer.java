public class CatDogBalancer {
    public static boolean catDogBalancer(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("cat")) {
                countCat++;
            }
            if (str.substring(i, i + 3).equals("dog")) {
                countDog++;
            }
        }
        if (countCat == countDog) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        System.out.println(catDogBalancer("1cat1cadodog"));
        System.out.println(catDogBalancer("catcat"));
        System.out.println(catDogBalancer("catdog"));
        System.out.println(catDogBalancer("dogcat"));
    }
}
