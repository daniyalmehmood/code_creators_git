
public class TextProcessor {
    public static int countWords(String var0) {
        var0 = var0.trim();
        if (var0.isEmpty()) {
            return 0;
        } else {
            String[] var1 = var0.split("\\s+");
            return var1.length;
        }
    }

    public static String replaceWord(String var0, String var1, String var2) {
        return var0.replaceAll("\\b" + var1 + "\\b", var2);
    }

    public static void main(String[] var0) {
        String var1 = " Learning Java improves your skills and knowledge";
        System.out.println("Original sentence: " + var1);
        int var2 = countWords(var1);
        System.out.println("Word count: " + var2);
        String var3 = replaceWord(var1, "JAVA", "Python");
        System.out.println("After replacement: " + var3);
    }
}
