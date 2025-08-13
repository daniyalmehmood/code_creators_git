public class MonkeyBehavior  {

    public boolean areMonkeysInTrouble (boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
            return true;
        }
        return false;
    }
}
