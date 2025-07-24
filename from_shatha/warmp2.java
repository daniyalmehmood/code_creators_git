public class warmp2{
	
String stringTimes(String str, int n) {
   
    StringBuilder sb = new StringBuilder(str.length() * n);
    for (int i = 0; i < n; i++) {
        sb.append(str);
    }
    return sb.toString();
}

public String frontTimes(String str, int n) {
    String front = str.length() < 3 ? str : str.substring(0, 3);
    StringBuilder result = new StringBuilder(front.length() * n);
    for (int i = 0; i < n; i++) {
        result.append(front);
    }
    return result.toString();
}

int countXX(String str) {
  int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                count++;
            }
        }
            return count;
}

boolean doubleX(String str) {
        int i = str.indexOf("x");
        if (i == -1) {
            return false;
        }
        if (i + 1 >= str.length()) {
            return false;
        }
        return str.charAt(i + 1) == 'x';
    }

public String stringBits(String str) {
    String result = "";
    for (int i = 0; i < str.length(); i += 2) {
        result += str.charAt(i);
    }
    return result;
}

public String stringSplosion(String str) {
  String result = "";
  for (int i=0; i<str.length(); i++) {
    result = result + str.substring(0, i+1);
  }
  return result;
}


public int last2(String str) {
  
     if (str.length() < 2) {
            return 0;
        }

        String last2 = str.substring(str.length() - 2); 
        int count = 0;


        for (int i = 0; i < str.length() - 2; i++) {
            String sub = str.substring(i, i + 2); 
            if (sub.equals(last2)) {            
                count++;                    
            }
        }

        return count;
    }
	public int arrayCount9(int[] nums) {
        int count = 0; 


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }

        return count;
    }




public boolean arrayFront9(int[] nums) {
  
 int end = nums.length;
  if (end > 4) end = 4;
  
  for (int i=0; i<end; i++) {
    if (nums[i] == 9) return true;
  }
  
  return false;
}



public boolean array123(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
        if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
            return true;
        }
    }
    return false;
}



public int stringMatch(String a, String b) {
   int count = 0;

        for (int i = 0; i < a.length() - 1 && i < b.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
                count++;
            }
        }

        return count;
    }



public String stringX(String str) {
   if (str.length() <= 2) {
            return str;
        }
        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);
        StringBuilder sb = new StringBuilder();
        sb.append(first);
        for (int i = 1; i < str.length() - 1; i++) {
            char current = str.charAt(i);
            if (current != 'x') {
                sb.append(current);
            }
        }
        sb.append(last);

        return sb.toString();
    }


public String altPairs(String str) {
  StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i += 4) {
            result.append(str.charAt(i));
            if (i + 1 < str.length()) {
                result.append(str.charAt(i + 1));
            }
        }

        return result.toString();
}


public String stringYak(String str) {
  StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2;
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
}


public int array667(int[] nums) {
  
 int count = 0;
        for (int i=0; i < (nums.length-1); i++) {
            if (nums[i] == 6) {
                if (nums[i+1] == 6 || nums[i+1] == 7) {
                    count++;
                }
            }
        }
        return count;
    }



public boolean noTriples(int[] nums){
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
            return true;
    }
  


public boolean has271(int[] nums) {
   for(int i=0; i<nums.length-2;i++){
        int x=nums[i];
        int addto5=nums[i+1];
        int minusof1=nums[i+2];

        if (addto5 == x + 5 && Math.abs(minusof1 - (x - 1)) <= 2) {
            return true;
        }
    }
  return false;
}








}