public class LastTwo {

    public String lastTwo(String str) {
        if(str.length()==1)return str;
        else if (str.isEmpty())return "";
            String last=str.substring(str.length()-2);
            StringBuilder string1;
        string1 = new StringBuilder(last);

        if (str.length()>=2){
            return str.substring(0,str.length()-2)+string1.reverse();


        } else return "";
    }

}
