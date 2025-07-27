public class WarmUp2 {

    public String stringTimes(String str, int n) {
        n= Math.abs(n);
        String result="";
        for (int i=0; i< n;i++ ){
            result+=str;
        }
        return result ;
    }

    public String frontTimes(String str, int n) {
        int length =3;
        if (str.length()<3){
            length=str.length();
        }


        String front= str.substring (0,length);
        String result="";
        for (int i=0;i<n;i++){
            result=front +result ;
        }
        return result;
    }


    int countXX(String str) {
        int count=0;
        for (int i=0; i<str.length()-1;i++){
            if (str.substring(i,i+2).equals("xx")){
                count++;
            }
        }
        return count;
    }


    boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) return false;

        if (i+1 >= str.length()) return false;
        return str.substring(i+1, i+2).equals("x");

    }


    public String stringBits(String str) {
        String word="";

        for (int i=0;i<str.length();i+=2){
            word += str.substring(i,i+1);

        }
        return word;
    }


    public String stringSplosion(String str) {
        String result="";
        for (int i=0;i<str.length();i++){
            for (int j=0;j<=i;j++){
                result += str.substring(j,j+1);
            }

        }
        return result;
    }


    public int last2(String str) {
        if (str.length() < 2) return 0;
        String end = str.substring(str.length()-2);

        int count = 0;

        for (int i=0; i<str.length()-2; i++) {
            String sub = str.substring(i, i+2);
            if (sub.equals(end)) {
                count++;
            }
        }

        return count;
    }


    public int arrayCount9(int[] nums) {

        int count=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]==9) count++;
        }
        return count;
    }


    public boolean arrayFront9(int[] nums) {

        int length = nums.length;
        if (length > 4) length=4;
        for (int i=0 ; i<length ; i++){
            if (nums[i]==9) return true;
        }
        return false;
    }


    public boolean array123(int[] nums) {
        for (int i=0; i<nums.length-2; i++){
            if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) return true;
        }
        return false;
    }


    public int stringMatch(String a, String b) {

        int len = 0;
        if (a.length()>b.length()) len= b.length();
        else len = a.length();

        int count =0;

        for(int i=0 ; i< len -1 ;i++){
            String asub= a.substring(i,i+2);
            String bsub= b.substring(i,i+2);
            if (asub.equals(bsub)) count ++;
        }
        return count;
    }


    public String stringX(String str) {

        String result= "";
        for (int i=0 ; i<str.length() ; i++){

            if (!(str.substring(i, i+1).equals("x") && i > 0 && i < (str.length()-1))){
                result = result + str.substring(i, i+1);
            }
        }
        return result;
    }


    public String altPairs(String str) {
        String result="";

        for (int i=0; i<str.length(); i= i+4){
            result += str.charAt(i);

            if (i + 1 < str.length()) {
                result += str.charAt(i + 1);

            }

        }

        return result;
    }



    public String stringYak(String str) {
        String result = "";

        for (int i = 0; i < str.length(); ) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 1)=='a' && str.charAt(i + 2) == 'k') {
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }

        return result;
    }


    public int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }



    public boolean noTriples(int[] nums) {
        for (int i=0; i<nums.length-2 ; i++){
            int number=nums[i];

            if (nums[i+1]==number && nums[i+2]==number) return false;
        }
        return true;
    }



    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int val = nums[i];
            if (nums[i + 1] == val + 5 && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
                return true;
            }
        }
        return false;
    }



    

}
