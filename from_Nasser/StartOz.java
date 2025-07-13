public class StartOz {

    public static String startOz(String str) {

        if (str.substring(0,1).equals("o") && !str.substring(1, 2).equals("z")) {
            return "o";

        } else if (str.substring(0, 2).equals("oz")) {
            return "oz";

        } else if (str.substring(1, 2).equals("z")) {

            return "z";

        }
        else return "";
    }

    public static void main(String[] args){

        System.out.println(startOz("oznasser"));
        System.out.println(startOz("onnasser"));
        System.out.println(startOz("aznasser"));
    }

}
