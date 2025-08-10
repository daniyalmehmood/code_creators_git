public class EndOther {

    public boolean doesOneStringEndWithOther(String a, String b) {

        a=a.toLowerCase();
        b=b.toLowerCase();

        if (a.endsWith(b) || b.endsWith(a)) return true;
        return false;
    }
}
