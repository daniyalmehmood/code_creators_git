public class ArrayFront9{
public boolean arrayFront9(int[] nums) {{
    int done=nums.length;
    if (done>4) done=4;

    for (int i=0; i<done; i++)

        if (nums[i]==9)

            return true;
}return false;}}
