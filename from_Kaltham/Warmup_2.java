public class Warmup_2 {

    public String stringTimes(String str, int n) {
        StringBuilder str2=new StringBuilder();
        for(int i=0; i<n; i++){
            str2.append(str);
        }
        return str2.toString();
    }
	
	public String frontTimes(String str, int n) {
        StringBuilder str3 = new StringBuilder();
        if (str.length() < 3) {
            for (int i = 0; i < n; i++) {
                str3.append(str);
            }
            return str3.toString();
        }
        else{
            String str2 = str.substring(0, 3);
            for (int i = 0; i < n; i++) {
                str3.append(str2);
            }
            return str3.toString();
        }
    }
	
	int countXX(String str) {
        int count = 0;
        if (str.contains(" ")) {
            int space = str.indexOf(" ");
            String firstWord = str.substring(0, space);
            for (int i = 0; i < firstWord.length(); i++) {
                if (firstWord.charAt(i) == ('x')) {
                    count++;
                }
            }
            return count;
        } else if (!str.isEmpty()) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ('x')) {
                    count++;
                }
            }
            if(count>0){
                return count - 1;
            }
            return count;
        }
        else{
            return 0;
        }

    }
	
	boolean doubleX(String str) {
        int postionOfx=str.indexOf('x');
        if(postionOfx==-1 || postionOfx+1>=str.length()){
            return false;
        }
        return str.charAt(postionOfx+1)=='x';
    }
	
	 public String stringBits(String str) {
        StringBuilder str1=new StringBuilder();
      for(int i=0; i<str.length();i+=2){
          str1.append(str.charAt(i));
      }
      return str1.toString();
    }

    public String stringSplosion(String str) {
        String str1="";
        for (int i = 0; i < str.length(); i++) {//code
            str1=str1+str.substring(0,i+1);
        }
        return str1.toString();
    }


    public int last2(String str) {
        int count = 0;
        if(str.length()>1) {
            String str1 = str.substring(str.length() - 2);
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.substring(i, i + 2).equals(str1)) {
                    count++;
                }
            }
            return count;
        }
        else{
            return 0;
        }
    }
	
	public int arrayCount9(int[] nums) {
        int count=0;
      for(int i=0;i<nums.length;i++){
          if(nums[i]==9){
              count++;
          }
        }
      return count;
    }
	
	
	public boolean arrayFront9(int[] nums) {
        int lenghtOFArray=Math.min(nums.length,4);
      for(int i=0;i<lenghtOFArray;i++){
          if(nums[i]==9)
            return true;
          }
          
            return false;
    }
	
	
	public boolean array123(int[] nums) {
      for(int i=0;i<nums.length-2;i++){
          if(nums[i]==1&&nums[i+1]==2&&nums[i+2]==3)
            return true;

        }
        return false;
    }
	
	
	public int stringMatch(String a, String b) {
        int count=0;
        int lenght=Math.min(a.length(),b.length());
      for(int i=0;i<lenght-1;i++) {
          if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
              count++;
          }
      }
      return count;
    }
	
	
	public  String stringX(String str) {
        if(str.length()<2 || str.isEmpty()){
            return str;
        }
        String front=str.substring(0,1);
        String back=str.substring(str.length()-1);
        String str3=str.substring(1,str.length()-1);
        StringBuilder str1=new StringBuilder(str3);
        StringBuilder newstr= new StringBuilder();
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!='x'){
                newstr.append(str1.charAt(i));
            }
        }

        return front+newstr.toString()+back;
    }
	
	
	public String altPairs(String str) {
        StringBuilder str1=new StringBuilder();
        for (int i=0; i<str.length();i+=4){
             str1.append(str.charAt(i));
             if(i+1<str.length()) {
                 str1.append(str.charAt(i + 1));
             }
        }
        return str1.toString();
    }


    public String stringYak(String str) {
        StringBuilder newstr=new StringBuilder(str);
        for(int i=0;i<newstr.length()-2;) {
                if (newstr.substring(i, i + 3).equals("yak")) {
                    newstr.delete(i, i + 3);
                }
                else{
                    i++;
                }
            }
        return newstr.toString();
    }
	
	
	public int array667(int[] nums) {
        int count=0;
          for(int i=0;i<nums.length-1;i++){
              if (nums[i]==6 && nums[i+1]==6||nums[i]==6 && nums[i+1]==7) {
                  count++;
              }
          }
          return count;
    }
	
	
	public boolean noTriples(int[] nums) {
        for(int i=0;i<nums.length-2;i++){
            if(nums[i]==nums[i+1]&& nums[i+1]==nums[i+2]){
                return false;
            }
        }
        return true;
    }


    public boolean has271(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+5==nums[i+1] && Math.abs((nums[i+2])-(nums[i]-1))<=2){
                return true;
            }
        }
        return false;
    }


}

