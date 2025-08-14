public class WithoutTwo {

    public String removeMatchingStartAndEnd(String str) {
        if (str.length()==1) return str;
        if (str.length()<3) return "";
        String front = str.substring(0,2);
        String start = str.substring(2);
        String end = str.substring(str.length()-2);

        if (front.equals(end)) return start;
        return str;

    }

}
