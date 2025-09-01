public class HappyGChecker {
    public boolean areAllGsHappy(String str) {
        String lowerStr = str.toLowerCase();

        for (int i = 0; i < lowerStr.length(); i++) {
            if (lowerStr.charAt(i) == 'g') {
                boolean leftHappy = (i > 0) && (lowerStr.charAt(i - 1) == 'g');
                boolean rightHappy = (i < lowerStr.length() - 1) && (lowerStr.charAt(i + 1) == 'g');
                if (!leftHappy && !rightHappy) {
                    return false;  // lonely 'g' found
                }
            }
        }
        return true;  // all 'g's happy
    }

    }

