public class StringMixer {
    public String alternatingStringMerger(String a, String b) {
        StringBuilder newString = new StringBuilder();


        int lengthMin=Math.min(a.length(),b.length());
        for (int i=0;i<lengthMin;i++){
            newString.append(a.charAt(i)).append(b.charAt(i));
        }
        if (a.length()<b.length()){
            String restB=b.substring(a.length());
            newString.append(restB);

        }
        if (a.length()>b.length()){
            String restA=a.substring(b.length());
            newString.append(restA);

        }
        return newString.toString();
    }
}
