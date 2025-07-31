public class WithoutX2 {

    public String withoutX2(String str) {

        char[] strChar=str.toCharArray();
        StringBuilder string1=new StringBuilder();


            if(!str.isEmpty() && !(strChar[0] =='x') ){
              string1.append(str.charAt(0));
            }
            if(str.length()>=2&&!(strChar[1] =='x') ) {
                string1.append(str.charAt(1));
            }
            if(str.length()>2 ) {
                string1.append(str.substring(2));

            }




        return string1.toString();
    }

}
