public class CommonEndsFinder {
    public String findSamePrefixAndSuffix(String string) {
        String result ="";
        for (int i = 1; i <=string.length() /2; i++) {
            String Front= string.substring(0,i);
            String End= string.substring(string.length()-i);
            if (Front.contains(End)){
                result=Front;
            }
        }
        return result;
    }

}








