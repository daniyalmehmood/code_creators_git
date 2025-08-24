public class CatDog {
    public boolean catDog(String str) {
        int cats = 0, dogs = 0;
        for (int i = 0; i <= str.length() - 3; i++) {
            String chunk = str.substring(i, i + 3);
            if (chunk.equals("cat")) cats++;
            if (chunk.equals("dog")) dogs++;
        }
        return cats == dogs;
    }
    public static void main(String[] args) {
        CatDog cd = new CatDog();
        System.out.println(cd.catDog("catdog"));
        System.out.println(cd.catDog("catcat"));
        System.out.println(cd.catDog("1cat1cadodog"));
    }
}