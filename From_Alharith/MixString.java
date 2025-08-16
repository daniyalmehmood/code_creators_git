public class MixString {

    public String MergeString(String a, String b) {
        int lenA= a.length();
        int lenB= b.length();
        int length = lenB;
        StringBuilder result= new StringBuilder();

        if (lenA <=lenB) length=lenA;

        for (int i=0; i<length; i++){
            result.append(a.substring(i,i+1) + b.substring(i,i+1)) ;
        }
        if (lenA<lenB)  result.append (b.substring(length));
        else result.append (a.substring(length));

        return result.toString();


    }

}
