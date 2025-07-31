public class MinCat {

    public String minCat(String a, String b) {



       if(a.length()>b.length()){

           String aMod=a.substring(a.length()-b.length());
           return aMod+b;
        }
    else if( b.length()>a.length()){
           String bMod=b.substring(b.length()-a.length());
           return a+bMod;

        }
    else return a+b;

    }

}
