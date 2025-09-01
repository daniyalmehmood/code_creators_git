public class SandwichFinder {
    public String getSandwichFilling(String str) {
        for (int i = 0; i < str.length() - 5; i++) {
            boolean firstBread = str.startsWith("bread", i);
            if (firstBread) {
                for (int j = str.length() - 5; j > i + 5; j--) {
                    boolean secondBread = str.startsWith("bread", j);
                             if (secondBread) {
                        return str.substring(i + 5, j);
                    }
                }
            }
        }
        return "";
    }
}
