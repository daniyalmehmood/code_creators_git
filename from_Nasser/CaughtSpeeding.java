public class CaughtSpeeding {

    public int caughtSpeeding(int speed, boolean isBirthday) {

        if(speed<=60 && !isBirthday)return 0;
        else if(speed>=61 && speed<=80 && !isBirthday)return 1;


        else if(speed<=65 && isBirthday)return 0;
        else if(speed <= 85 && isBirthday)return 1;
        return 2;

    }


}
