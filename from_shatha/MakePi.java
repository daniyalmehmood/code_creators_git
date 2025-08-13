
import java.util.Arrays;

public class MakePi {
    public int[] makePi() {
        return new int[]{3,1,4};
    }
        public static void main(String[] args){
            MakePi obj = new MakePi();
            int[] result = obj.makePi();

            System.out.println(Arrays.toString(result));
    }
}
