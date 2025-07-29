public class StringSplosion {
    public static String stringSplosion(String str) {
        StringBuilder result=new StringBuilder();
        char fristChar = ' ';

        if (str.isEmpty())
            return "";
        else {
            fristChar = str.charAt(0);//c

            for (int i = 1; i < str.length(); i++)//i=2
            {
                result.append(str, 0, i + 1);
            }

        }
        return String.valueOf(fristChar) + result;
    }