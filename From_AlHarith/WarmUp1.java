public class WarmUp1 {

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            return true;
        }

        return false;
    }


    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if (aSmile && bSmile){
            return true;
        }
        if (!aSmile && !bSmile){
            return true;
        }
        return false;
    }


    public int sumDouble(int a, int b) {
        if (a!=b){
            return a+b;

        }
        return 2*(a+b);
    }

    public int diff21(int n) {
        if (n<21){
            return 21-n;
        }
        return 2*(n-21);
    }

    public boolean parrotTrouble(boolean talking, int hour) {

        if (talking && (hour < 7 || hour >20)){
            return true;
        }
        return false;
    }

    public boolean makes10(int a, int b) {
        if (a+b==10 || a==10 || b==10){
            return true;

        }
        return false;
    }

    public boolean nearHundred(int n) {
        if (Math.abs(100 -n)<=10  || Math.abs(200-n ) <=10 ){
            return true;
        }
        return false;
    }


    public boolean posNeg(int a, int b, boolean negative) {

        if (negative){
            return (a<0 && b<0);
        }
        return ((a<0 && b>=0)||(a>=0 && b<0));

    }


    public String notString(String str) {
        if (str.length()>= 3 && str.substring(0,3).equals("not")){
            return str;
        }
        return "not " + str;

    }


    public String missingChar(String str, int n) {
        String front= str.substring(0,n);
        String back= str.substring(n+1);

        return front+back ;

    }



    public String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String mid = str.substring(1, str.length()-1);

        return str.charAt(str.length()-1) + mid + str.charAt(0);
    }



    public String front3(String str) {
        if (str.length() <=3) {
            return str+str+str;
        }
        return str.substring (0,3)+str.substring (0,3)+str.substring (0,3);
    }



    public String backAround(String str) {
        if (str.length()<=1){
            return str +str+str;
        }
        return str.charAt(str.length()-1) +str + str.charAt(str.length()-1);
    }



    public boolean or35(int n) {
        if (n%3==0 || n%5==0) {
            return true;
        }
        return false;
    }



    public String front22(String str) {
        int take =2;


        if (str.length()<take){
            take = str.length();

        }
        String front = str.substring(0,take);
        return front +str+front;
    }



    public boolean startHi(String str) {
        if (str.length()<2){
            return false;
        }
        if (str.substring(0,2).equals("hi") ){
            return true;
        }
        return false;
    }



    public boolean icyHot(int temp1, int temp2) {
        if ((temp1 <0 && temp2 > 100) || (temp2 <0 && temp1 > 100) ) return true;
        return false;
    }




    public boolean in1020(int a, int b) {
        if ((a>=10 && a<=20) || (b>=10 && b<=20)) return true;
        return false;
    }



    public boolean hasTeen(int a, int b, int c) {
        if ((a>=13 && a<=19) || (b>=13 && b<=19) || (c>=13 && c<=19)) return true;
        return false;
    }



    public boolean loneTeen(int a, int b) {
        if ((a>=13 && a<=19) && (b>=13 && b<=19)) return false;
        if ((a>=13 && a<=19) || (b>=13 && b<=19)) return true;
        return false;

    }




    public String delDel(String str) {
        if (str.length() >= 4 && str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4);
        }
        return str;
    }



    public boolean mixStart(String str) {
        if (str.length()<3) return false;
        if (str.substring(1,3).equals("ix")) return true;
        return false;
    }



    public String startOz(String str) {
        if (str.length()<2) return str;
        if (str.substring(0,2).equals("oz")) return "oz";
        if (str.substring(0,1).equals("o")) return "o";
        if (str.substring(1,2).equals("z")) return "z";
        return "";

    }


    public int intMax(int a, int b, int c) {
        int max =0;
        if (a>b) max=a;
        else max = b;

        if (max< c) max= c;

        return max;
    }


    public int close10(int a, int b) {
        int aDiff= Math.abs(a -10);
        int bDiff= Math.abs(b-10);

        if (aDiff<bDiff) return a;
        if (aDiff>bDiff) return b;
        return 0;
    }



    public boolean in3050(int a, int b) {
        if (((a>=30 && a<=40) && (b>=30 && b <=40)) || ((a>=40 && a<=50) && (b>=40 && b <=50))){
            return true;
        }
        return false;
    }



    public int max1020(int a, int b) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        if (a >= 10 && a <= 20) return a;
        if (b >= 10 && b <= 20) return b;
        return 0;
    }




    public boolean stringE(String str) {
        int count=0;

        for (int i=0; i< str.length(); i++ ){
            if (str.substring(i,i+1).equals("e")) count++ ;
        }
        return (count >= 1 && count <= 3);
    }





    public boolean lastDigit(int a, int b) {
        if (a%10 == b%10) return true;
        return false;
    }



    public String endUp(String str) {
        if (str.length()<=3) return str.toUpperCase();

        int length = (str.length()-3);
        String last = str.substring (length);
        String front= str.substring (0,length);
        return front + last.toUpperCase() ;
    }



    public String everyNth(String str, int n) {
        String result = "";

        for (int i=0; i<str.length(); i = i + n) {
            result = result + str.charAt(i);
        }
        return result;
    }

    
}
