public class EndsLy {
    public static boolean endsLy(String str) {
        if(str.length() >= 2) {
            String lastCh = str.substring(str.length() - 2);
            if (lastCh.equals("ly")) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        System.out.println(endsLy("oddly"));
        System.out.println(endsLy("y"));
        System.out.println(endsLy("oddy"));
    }
}
