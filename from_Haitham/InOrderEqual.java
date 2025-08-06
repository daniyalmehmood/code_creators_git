public class InOrderEqual {
public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (c > b && b > a) return true;
        else if (equalOk && c >= b && b >= a) return true;
        return false;
    }
}
