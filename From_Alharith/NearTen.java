public class NearTen {

    public boolean isnearTen(int num) {
        int mod= num%10;
        return (mod<=2 || mod >=8);
    }

}
