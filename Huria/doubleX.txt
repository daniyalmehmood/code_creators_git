public class DoubleX {

    public static boolean doubleX(String str) {

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == 'x') {
                if (str.charAt(i + 1) == 'x') {
                    return true;
                }
                else {
                    return false;
                }

            }
        }
        return false;
    }

        public static void main (String[]args){

            System.out.println(DoubleX.doubleX("axxbb"));
            System.out.println(DoubleX.doubleX("axaxax"));
            System.out.println(DoubleX.doubleX("xxxxx"));
            System.out.println(DoubleX.doubleX("xaxxx"));
            System.out.println(DoubleX.doubleX("aaaax"));
            System.out.println(DoubleX.doubleX(""));
            System.out.println(DoubleX.doubleX("xaxxx"));
            System.out.println(DoubleX.doubleX("xx"));


        }

    }

