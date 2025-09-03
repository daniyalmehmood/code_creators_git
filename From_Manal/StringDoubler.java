public class StringDoubler {
    // This method takes a string and returns a new string
    // where every character in the original is repeated twice.
    public static String repeatEachCharTwice(String input) {
            StringBuilder doubledString = new StringBuilder();

            for (int i = 0; i < input.length(); i++) {
                char currentChar = input.charAt(i);
                doubledString.append(currentChar).append(currentChar);
            }

            return doubledString.toString();
        }

        public static void main(String[] args) {
            System.out.println(repeatEachCharTwice("The"));
            System.out.println(repeatEachCharTwice("AAbb"));
            System.out.println(repeatEachCharTwice("Hi-There"));
        }
    }