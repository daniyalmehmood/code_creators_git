public class DelDel {
    public static String removeDel(String str) {
        if (str.substring(1,4).equals("del"))
        {
            StringBuilder newStr = new StringBuilder(str);
            newStr.delete(1,4);
            String newStr2= newStr.toString();
            return newStr2;
        }
        else {
        return str;
        }
    }

    }

