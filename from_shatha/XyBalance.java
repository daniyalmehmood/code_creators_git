public class xyBalance {
    public static boolean isXyBalanced(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');

        return lastX == -1 || (lastY != -1 && lastY > lastX);
    }
    public static void main (String[]args){
        System.out.println(isXyBalanced("aaxbby"));
        System.out.println(isXyBalanced("aaxbb"));
        System.out.println(isXyBalanced("yaaxbb"));
    }
}
