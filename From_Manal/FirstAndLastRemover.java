public class FirstAndLastRemover {
    public static String removeFirstAndLastCharacters(String str) {
        //if the string length less than or equal 2, return to empty
            if (str.length()<=2){
                return "";
            }
            return str.substring(1, str.length()-1);
        }
        public static void main(String[] args){
            System.out.println(removeFirstAndLastCharacters("Hello"));
            System.out.println(removeFirstAndLastCharacters("abc"));
            System.out.println(removeFirstAndLastCharacters("ab"));
        }

    }