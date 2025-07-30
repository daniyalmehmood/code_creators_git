public class front22 {

    public String front22(String str) {
        int take =2;


        if (str.length()<take){
            take = str.length();

        }
        String front = str.substring(0,take);
        return front +str+front;
    }
}
