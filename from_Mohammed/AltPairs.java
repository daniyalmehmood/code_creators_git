public String AltPairs(String str) {
    String res="";
    for (int i=0; i<str.length();i+=4){
        int end=i+2;
        if (end>str.length()){
            end=str.length();}
        res+=str.substring(i,end);}
    return res;
}
