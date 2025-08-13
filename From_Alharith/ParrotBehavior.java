public class ParrotBehavior  {

    public boolean isParrotCausingTrouble(boolean talking, int hour) {

    if (talking && (hour < 7 || hour >20)){
        return true;
    }
    return false;
}
}
