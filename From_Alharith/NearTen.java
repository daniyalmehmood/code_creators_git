public class NearTen {

    public boolean nearTen(int num) {
        int mod= num%10;
        return (mod<=2 || mod >=8);
    }

}
