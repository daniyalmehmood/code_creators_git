public class MonkeyTrouble {

    public boolean haveSameSmileState(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile || !aSmile && !bSmile) {
            return true;
        } else
            return false;
    }

}
