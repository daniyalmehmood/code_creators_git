public class LinearIn {

    public boolean checkInnerInOuter(int[] outer, int[] inner) {
        for (int i = 0; i < inner.length; i++) {
            boolean found = false;
            for (int j = 0; j < outer.length; j++) {
                if (outer[j] == inner[i]) {
                    found = true;
                    break;
                }

            }
            if (!found) return false;
        }
        return true;
    }

}
