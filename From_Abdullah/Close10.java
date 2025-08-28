public class Close10 {
    public int getNearestTo10(int a, int b) {

        int distanceA = Math.abs (a - 10);
        int distanceB = Math.abs (b - 10);

        if (distanceA < distanceB) {
            return a;
        }
        else if (distanceA > distanceB) {
            return b;
        }
        return 0 ;
    }
}
