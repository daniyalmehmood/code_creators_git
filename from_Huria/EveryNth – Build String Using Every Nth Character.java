public class EveryNth {

        String str;
        int n;

        public static String everyNth(String str, int n) {

            String newString = "";
            if (!str.isEmpty() && n >= 1) {


                for (int i = 0; i < str.length(); i = i + n) {

                    newString = newString + str.charAt(i);
                }
                return newString;

            }
            else {
                return "Check you input string must not be empty and n must not be negative";
                }
        }
            public static void main(String [] args){

                System.out.println( EveryNth.everyNth("Miracle", 2));
                System.out.println( EveryNth.everyNth("abcdefg", 2));
                System.out.println( EveryNth.everyNth("abcdefg", 3));
                System.out.println( EveryNth.everyNth("", 3));
                System.out.println( EveryNth.everyNth("abcdefg", 0));


            }
        }



