public class ALtPairs {

    public static String altPairs(String str) {

        StringBuilder string1=new StringBuilder();

        for(int i=0;i<str.length();i+=4){

            string1.append(str.charAt(i));


            if(i+1<str.length()){
                string1.append(str.charAt(i+1));
            }
        }

        return string1.toString();

    }

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
    }
    }



