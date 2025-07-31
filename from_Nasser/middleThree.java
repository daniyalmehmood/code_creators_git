public class middleThree {
    public String middleThree(String str) {
        StringBuilder string1=new StringBuilder();
        char[] str1=str.toCharArray();;
        if(str.length()%2 != 0){
        for (int i=str.length()/2-1;i<str.length()/2+2;i++){

            string1.append(str1[i]);
        }


        }

        return string1.toString();
    }



}
