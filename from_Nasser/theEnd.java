public class theEnd {

    public String theEnd(String str, boolean front) {

        StringBuilder string1=new StringBuilder();
        if(front){

            string1.append(str.charAt(0));
        }
            else {
                string1.append(str.charAt(str.length()-1));
        }

        return string1.toString();
    }
}
