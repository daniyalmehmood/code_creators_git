public class MonkeyBehavior  {

    public boolean areMonkeysInTrouble (boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){
            return true;
        }
        if (!aSmile && !bSmile){
            return true;
        }
        return false;
    }
}
