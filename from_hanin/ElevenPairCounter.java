public class ElevenPairCounter {
    public int countDoubleOnes(String str) {
        if (str.length() < 2) {
            return 0;
        } else {
            String first = str.substring(0, 2);
            if (first.equals("11")) {
                return 1 + countDoubleOnes(str.substring(2));
            } else {
                return 0 + countDoubleOnes(str.substring(1));
            }
        }
    }

}

