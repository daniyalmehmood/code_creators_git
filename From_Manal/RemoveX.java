
public class RemoveX {
//removes all X from the middle of the string
//exept at the first or last position
    public static String removeXExceptFirstAndLast(String str) {
        StringBuilder string1 = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++){
            if (str.charAt(i) != 'x')
                string1.append(str.charAt(i));
            }
        return str.substring(0, 1) + string1.toString() + str.substring(str.length() - 1);
    }
    public static void main(String[] arg) {
        System.out.println(removeXExceptFirstAndLast("xxHxix"));
        System.out.println(removeXExceptFirstAndLast("abxxxcd"));
        System.out.println(removeXExceptFirstAndLast("xabxxxcdx"));
    }
    }
