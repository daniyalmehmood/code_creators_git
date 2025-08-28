public class Front22 {
    public String wrapWithFrontTwoChars(String str) {
        String frstcharstwo;
        if (str.length () < 2) {
            frstcharstwo = str ;
        } else {
            frstcharstwo = str.substring (0,2);
        }
        return frstcharstwo + str + frstcharstwo;
    }

}
