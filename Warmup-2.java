public String stringTimes(String str, int n) {

    String r="";
    for(int i=0; i<n;i++) {
        r = r + str;
    }

    return r;
}
public static void main(String[] args) {
    System.out.println(stringTimes("Hi", 2));
    System.out.println(stringTimes("Hi", 3));
    System.out.println(stringTimes("Hi", 1) );
}






public String frontTimes(String str, int n) {
    String front = str.substring(0,Math.min(str.length(),3));
    String result ="";
    for(int i=0; i<n; i++){
        result = result + front;
    }
    return result;
}

public static void main(String[] args) {
    System.out.println(frontTimes("Chocolate", 2));
    System.out.println(frontTimes("Chocolate", 3));
    System.out.println(frontTimes("Abc", 3));
}







int countXX(String str) {

    int c=0;
    for(int i=0; i< str.length()-1; i++){
        if(str.substring(i, i+2).equals("xx")) c++;

    }
    return c;
}
public static void main(String[] args) {
    System.out.println(countXX("abcxx"));
    System.out.println(countXX("xxx") );
    System.out.println(countXX("xxxx"));
}






boolean doubleX(String str) {
    int index= str.indexOf("x");
    if (index== -1 || index +1>=str.length()){
        return false;
    }
    
    return str.charAt(index +1)== 'x';
}

public static void main(String[] args) {
    System.out.println(doubleX("axxbb"));
    System.out.println(doubleX("axaxax"));
    System.out.println(doubleX("xxxxx"));
}





public String stringBits(String str) {
    String r ="";

    for (int i=0; i<str.length(); i+=2) {
        r= r + str.substring(i, i+1);
    }
    return r;
}
public static void main(String[] args) {
    System.out.println(stringBits("Hello"));
    System.out.println(stringBits("Hi"));
    System.out.println(stringBits("Heeololeo"));
}





public String stringSplosion(String str) {
    String r="";
    for(int i=0; i<str.length(); i++) {
        r = r + str.substring (0, i+1);
    }
    return r;
}
public static void main(String[] args) {
    System.out.println(stringSplosion("Code"));
    System.out.println(stringSplosion("abc"));
    System.out.println(stringSplosion("ab"));
}






public int last2(String str) {

    if (str.length()<2) {
        return 0;

    }
    String end = str.substring(str.length()-2);
    int count=0;
    for (int i=0; i< str.length()-2; i++){
        String sub = str.substring(i, i+2);
        if (sub.equals(end)) {
            count++;
        }
    }
    return count;
}
public static void main(String[] args) {
    System.out.println(last2("hixxhi"));
    System.out.println(last2("xaxxaxaxx"));
    System.out.println(last2("axxxaaxx"));
}









public int arrayCount9(int[] nums) {

    int count = 0;

    for(int i= 0; i< nums.length; i++) {
        if (nums[i]==9){
            count++;
        }
    }

    return count;
}
public static void main(String[] args) {
    System.out.println(arrayCount9(new int[]{1, 9, 9}));
    System.out.println(arrayCount9(new int[]{1, 9, 9}));
    System.out.println(arrayCount9(new int[]{1, 9, 9, 3, 9}));
}








public boolean arrayFront9(int[] nums) {
    
  int n =nums.length;
  if(n>4) n=4;
  for (int i=0; i< n; i++) {
    if (nums[i] ==9){return true;}
    
  }
  return false;
}







public boolean array123(int[] nums) {

  for (int i =0; i< (nums.length-2); i++){
    if (nums[i]==1 && nums[i+1]==2 && nums [i+2]==3) 
    return true; }
    
    
  return false;
}







public int stringMatch(String a, String b) {
  int stringlength = Math.min(a.length(), b.length());
  int count = 0;
  for (int i=0; i<stringlength-1; i++) {
    String aSubstring = a.substring(i, i+2);
    String bSubstring = b.substring(i, i+2);
    if (aSubstring.contains(bSubstring)) {  
      count++;
    }
  }

  return count;
}








public class stringX {
    public static String stringX(String str) {
        StringBuilder string1 = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++){
            if (str.charAt(i) != 'x')
                string1.append(str.charAt(i));
            }
        return str.substring(0, 1) + string1.toString() + str.substring(str.length() - 1);
    }
    public static void main(String[] arg) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }
    }








public class altPairs {
    public static String altPairs(String str) {
        StringBuilder string1 = new StringBuilder();
        for (int i = 0; i < str.length(); i+=4) {
            string1.append(str.charAt(i));
            if (i + 1 < str.length())
                string1.append(str.charAt(i + 1));
        }
        return string1.toString();
    }

    public static void main(String[] arg) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }
}








public class stringYak {
    public static String stringYak(String str) {
        StringBuilder string1 = new StringBuilder(str);
        int i = 0;
        while (i <= string1.length() - 3) {
            if (string1.substring(i, i + 3).equals("yak")) {
                string1.delete(i, i + 3);
            } else {
                i++;
            }

        }
        return string1.toString();
    }
    public static void main(String[] arg) {
        System.out.println(stringYak("yakpak"));
        System.out.println(stringYak("pakyak"));
        System.out.println(stringYak("yak123ya"));
    }
}












public class array667 {
    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 6 && nums[i + 1] == 6) {
                count++;
            }
            if (nums[i] == 6 && nums[i + 1] == 7) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] arg) {
        System.out.println(array667(new int[]{6, 6, 2}));
        System.out.println(array667(new int[]{6, 6, 2, 6}));
        System.out.println(array667(new int[]{6, 7, 2, 6}));
    }
}










public class noTriples {
    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] arg) {
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 2, 2, 2, 1}));
        System.out.println(noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
    }
}








public class Has271 {
    public static  boolean Has271(int[] nums) {
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] ==2 && nums[i + 1] == 7 && nums[i+2] == 1) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] arg) {
        System.out.println(Has271(new int[]{1, 2, 7, 1}));
        System.out.println(Has271(new int[]{1, 2, 8, 1}));
        System.out.println(Has271(new int[]{2, 7, 1}));
    }
    }