public class Addition {

    public static Integer sumDouble(Integer a, Integer b) {
        int result;
        if (a.equals(b)) {
            result = 2 * (a + b);
        } else result = a + b;
        return result;
    }
}
