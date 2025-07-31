public class StringYak {

        public static String stringYak(String str) {
            String newString="";
            int x = str.length();

            for (int i = 0; i < x; i++) {
                if (x > i + 2 && str.charAt(i) == 'y' && str.charAt(i + 1) == 'a' && str.charAt(i + 2) == 'k') {
                    i = i + 2;
                } else {

                    newString = newString + str.charAt(i);
                }
            }
            return newString;
        }


        public static void main(String [] args){

            System.out.println( StringYak.stringYak("yakpak"));
            System.out.println( StringYak.stringYak("pakyak"));
            System.out.println( StringYak.stringYak("yak123ya"));


        }
    }


