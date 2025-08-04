public String StringSplosion(String str) {
    String res= "";
    for(int i=0; i<str.length();i++)
        res+=str.substring(0,i+1);
    return res;
}
