public class StringRepeater {
        public static String repeatThreeTimes(String str) {
            if (str.length() >= 2) {
                // Get the first 2 characters and repeat them 3 times
                String newString = str.substring(0, 2);
                return newString + newString +newString;
            }
            if (str.length() >= 1) {
                // If only 1 character, repeat it 3 times
                return str + str + str;
            }
            // If empty string, return as is
            return str;
        }

    }
