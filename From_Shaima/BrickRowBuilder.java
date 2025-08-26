public class BrickRowBuilder {
    public  static boolean canBuildRow(int small, int big, int goal) {
        int bigBrick = goal/ 5;
        int smallBrick =0;
        if(bigBrick >= big){ //  if bigBar is greater than big,
            smallBrick = goal -(big*5); // update value of smallBrick
        }
        else{
            smallBrick = goal -(bigBrick*5); // if bigBrick is smaller than big , calculate the value of smallBrick
        }
        if (smallBrick<=small) return true; // check the value of smallBrick and small
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canBuildRow(3,1,8));
    }
}
