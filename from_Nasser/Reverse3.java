import java.sql.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Reverse3 {

    public int[] reverse3(int[] nums) {

        int last=nums[0];
        int first=nums[2];
        int mid=nums[1];

        return new int[]{first,mid,last};

    }

}
