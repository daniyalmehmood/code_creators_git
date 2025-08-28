public class XyzMiddle {
    public boolean xyzMiddle(String str) {
        int idx = str.indexOf("xyz");
        while (idx != -1) {
            int left = idx;
            int right = str.length() - (idx + 3);
            if (Math.abs(left - right) <= 1) return true;
            idx = str.indexOf("xyz", idx + 1);
        }
        return false;
    }

    public static void main(String[] args) {
        XyzMiddle xm = new XyzMiddle();
        System.out.println(xm.xyzMiddle("AAxyzBB"));
        System.out.println(xm.xyzMiddle("AxyzBB"));
        System.out.println(xm.xyzMiddle("AxyzBBB"));
    }
}