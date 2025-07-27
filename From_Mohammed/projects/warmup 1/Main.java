//sleepIn
public boolean sleepIn(boolean weekday, boolean vacation) {
    if(!weekday || vacation){
        return true;}
    return false;}

//monkeyTrouble
public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    if((aSmile && bSmile) || (!aSmile && !bSmile)){
        return true;}
    return false;}

//sumDouble
public int sumDouble(int a, int b) {
    if(a!=b){
        return a+b;}
    return 2*(a+b);}

//diff21
public int diff21(int n) {
    if(n>21){
        return (n-21)*2;}
    return 21-n;}

//parrotTrouble
public boolean parrotTrouble(boolean talking, int hour) {
    if(talking & hour<7 || talking&hour>20){
        return true;}
    return false;}

//makes10
public boolean makes10(int a, int b) {
    if(a+b==10 || a==10 || b==10){
        return true;}
    return false;}

//nearHundred
public boolean nearHundred(int n) {

    if (Math.abs(100-n)<=10||Math.abs(200-n)<=10){
        return true;}
    return false;}

//posNeg
public boolean posNeg(int a, int b, boolean negative) {
    if(negative){
        return (a<0 && b<0);}
    return (a * b < 0);}

//notString
public String notString(String str) {
    if(str.length()>=3 && str.substring(0,3).equals("not"))
        {return str;}
    return "not "+str;}

public String missingChar(String str, int n) {
    String front = str.substring(0,n);

    String back=str.substring(n+1, str.length());
    return front + back;}


public String frontBack(String str) {
    if(str.length() <= 1) return str;
    String m =str.substring(1,str.length()-1);

    return str.charAt(str.length()-1)+m+str.charAt(0);}


public String front3(String str) {
    if(str.length()>=3)
        str=str.substring(0,3);


    return str+str+str;}


public String backAround(String str) {
    String last=(str.substring(str.length()-1));
    return last+str+last;}


public boolean or35(int n) {
    return(n%3==0||n%5==0);}


public String front22(String str) {
    int rep=2;
    if(rep>str.length()){
        rep= str.length();}
    String front=str.substring(0,rep);
    return front+str+front;}


public boolean startHi(String str) {
    if (str.length()<2)
        return false;
    String FT=str.substring(0,2);
    if(FT.equals("hi"))
        return true;
        return false;}

public boolean icyHot(int temp1, int temp2) {{
    if((temp1<0&&temp2>100)||(temp1>100&&temp2<0))
        return true;}
        return false;}

public boolean in1020(int a, int b) {

    if((a>=10&&a<=20)||(b>=10&&b<=20)){
        return true;}
        return false;}

public boolean hasTeen(int a, int b, int c){ {
    if((a>=13&&a<=19)||(b>=13&&b<=19)||(c>=13&&c<=19))
        return true;}
    return false;}


public boolean loneTeen(int a, int b) {
    boolean aa=(a>=13&&a<=19);
    boolean bb=(b>=13&&b<=19);
    return (aa&&!bb)||(!aa&&bb);}

public String delDel(String str) {
    if(str.length()>=4 && str.substring(1,4).equals("del")){
        return str.substring(0,1)+str.substring(4);}
    return str;}


public boolean mixStart(String str) {
    if(str.length()>=3&& str.substring(1,3).equals("ix"))
    {return true;}
    return false;}


public String startOz(String str){

    String result="";

    if(str.length()>=1 && str.charAt(0)=='o'){
        result=result+str.charAt(0);}

    if (str.length()>=2&&str.charAt(1)=='z'){
        result=result+str.charAt(1);}
    return result;}

public int intMax(int a, int b, int c) {

    int max;
    if (a<b){max=b;}
    else{ max=a;}
    if (max<c)
    {max=c;}
    return max;}


public int close10(int a, int b) {
    int aDif=Math.abs(a-10);
    int bDif=Math.abs(b-10);

    if(aDif<bDif)
        return a;

    else if(aDif>bDif)
        return b;

    else
        return 0;}


public boolean in3050(int a, int b) {
    if((a>=30&&a<=40)&&(b>=30&&b<=40))
        return true;
    else if((a>=40&&a<=50)&&(b>=40&&b<=50))
        return true;

    else return false;}


public int max1020(int a, int b) {
    if(b>a){
        int temp=a;
        a=b;
        b=temp;}
    if (a>=10 && a<=20)
        return a;

    if (b>=10 && b<=20)
        return b;

        return 0;}



public boolean stringE(String str) {
    int count=0;

    for(int i=0; i<str.length(); i++)
        if (str.charAt(i)=='e') count++;

    return (count>=1 && count<=3);}


public boolean lastDigit(int a, int b) {{
    if(a%10 == b%10)
        return true;}
        return false;}


public String endUp(String str) {

    if (str.length()<=3)
        return str.toUpperCase();

    int cap=str.length()-3;
    String frnt=str.substring(0,cap);
    String bck=str.substring(cap);
    return frnt+bck.toUpperCase();
}



public String everyNth(String str, int n) {
    String res="";

    for (int i=0; i<str.length(); i=i+n){
        res=res+str.charAt(i);}
        return res;
}



