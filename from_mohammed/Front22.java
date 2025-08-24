public class Front22 {
    public String front22(String str) {
        int rep=2;
        if(rep>str.length()){
            rep= str.length();}
        String front=str.substring(0,rep);
        return front+str+front;}

}
