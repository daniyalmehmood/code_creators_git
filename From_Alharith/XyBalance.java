public class XyBalance {

    public boolean isEveryXFollowedByY(String str) {

        boolean seenY=false;

        for (int i=str.length()-1; i>=0; i--){

            if (str.substring(i,i+1).equals("y")){
                seenY =true;
            }
            else if (str.substring(i,i+1).equals("x") && !seenY) return false;

        }return true;
    }

}
