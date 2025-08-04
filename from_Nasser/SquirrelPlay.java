public class SquirrelPlay {

    public boolean squirrelPlay(int temp, boolean isSummer) {

        if(!isSummer)return 60<=temp && 90>=temp;
        else return 60<=temp && 100>=temp;

    }

}
