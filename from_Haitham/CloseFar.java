public class CloseFar {
public boolean closeFarFromThreeNumber(int a, int b, int c) {
        if((Math.abs(a-b)<=1&&Math.abs(a-c)>1&&Math.abs(b-c)>1)||(Math.abs(a-c)<=1&&Math.abs(a-b)>1&&Math.abs(c-b)>1))return true;

        return false;
    }
	}