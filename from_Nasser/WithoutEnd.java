public class WithoutEnd {

    public String withoutEnd(String str) {
        char[] mid=str.toCharArray();
        StringBuilder string1=new StringBuilder();

        for (int i=1;i<str.length()-1;i++){

            string1.append(mid[i]);
        }
     return string1.toString();

    }

}
