public class CatDogChecker {
    public static boolean catDogEqual(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 3);

            if (sub.equals("cat")) {
                catCount++;
            } else if (sub.equals("dog")) {
                dogCount++;
            }
        }

        return catCount == dogCount;
    }
    public static void main (String[]args){
        System.out.println(catDogEqual("catdog"));
        System.out.println(catDogEqual("catcat"));
        System.out.println(catDogEqual("1cat1cadodog"));
    }
}
