public class StringBits {

        String str;

        public static String stringBits(String str) {

            String newString = "";


                for (int i = 0; i < str.length(); i = i + 2) {

                    newString = newString + str.charAt(i);
                }
                return newString;

            }



        public static void main(String [] args){

            System.out.println( StringBits.stringBits("Hello"));
            System.out.println( StringBits.stringBits("Chocoate"));
            System.out.println( StringBits.stringBits("Hello Kitten"));
            System.out.println( StringBits.stringBits("Greetings"));


        }
    }

