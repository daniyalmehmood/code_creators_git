public class CommonStringCounter {
    public int countCommonElements(String[] a, String[] b) {
        int aI = 0;
        int bI = 0;
        int count = 0;
        String prev = "";

        while (aI < a.length && bI < b.length) {
            int cmp = a[aI].compareTo(b[bI]);

            if (cmp == 0) {
                if (!a[aI].equals(prev)) {
                    count++;
                    prev = a[aI];
                }

                String match = a[aI];
                while (aI < a.length && a[aI].equals(match)) aI++;
                while (bI < b.length && b[bI].equals(match)) bI++;
            } else if (cmp < 0) {
                aI++;
            } else {
                bI++;
            }
        }

        return count;
    }

}