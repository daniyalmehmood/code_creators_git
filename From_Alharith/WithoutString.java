public class WithoutString {

    public String removeSubstringIgnoreCase(String base, String remove) {

        StringBuilder result= new StringBuilder();
        String baseLower=base.toLowerCase();
        String removeLower=remove.toLowerCase();
        int lenRemove=remove.length();


        for (int i=0;i<base.length();){

            if (i<=base.length()-lenRemove && (baseLower.substring(i,i+lenRemove).equals(removeLower))){
                i+=lenRemove;
            }
            else {
                result.append(base.charAt(i)) ;
                i++;
            }
        }
        return result.toString();
    }

}
