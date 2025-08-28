public class XyBalance {
    public boolean xyBalance(String str) {
        int lastX = -1;
        int lastY = -1;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'x') lastX = i;
            if (c == 'y') lastY = i;
        }
        return lastX == -1 || lastY > lastX;
    }

    public static void main(String[] args) {
        XyBalance xb = new XyBalance();
        System.out.println(xb.xyBalance("aaxbby"));
        System.out.println(xb.xyBalance("aaxbb"));
        System.out.println(xb.xyBalance("yaaxbb"));
    }
}