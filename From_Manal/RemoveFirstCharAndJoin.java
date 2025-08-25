public class RemoveFirstCharAndJoin {
    public static String concatWithoutFirstChar(String a, String b) {
        //remove the first character from each string
        String part1 = a.substring(1);
        String part2 = b.substring(1);
        return part1 + part2;
    }
    public static void main(String[] args) {
        System.out.println(concatWithoutFirstChar("Hello", "There"));
        System.out.println(concatWithoutFirstChar("java", "code"));
        System.out.println(concatWithoutFirstChar("shotl", "java"));
    }
}

