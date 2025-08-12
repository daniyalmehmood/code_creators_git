public class LastTwo {
<<<<<<< HEAD
    public static String lastTwo(String str) {
   if (str.length() < 2) {
            return str;
        }
return str.substring(0, str.length() - 2)
        + str.charAt(str.length() - 1)
        + str.charAt(str.length() - 2);
    }


public static void main(String[] args) {
    System.out.println(lastTwo("coding"));
    System.out.println(lastTwo("cat"));
    System.out.println(lastTwo("ab"));
}
}
=======
    public static int last2(String str) {
        if (str.length() < 2) {
            return 0;
        }

        String last2 = str.substring(str.length() - 2);
        int count = 0;


        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2);
            if (sub.equals(last2)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
    }
}
>>>>>>> origin/Shatha-Almamari
