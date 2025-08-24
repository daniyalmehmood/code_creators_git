public class ExtraFront {

    public String extraFront(String str) {

        if (str.length()>2){

            String front=str.substring(0,2);
            return front+front+front;
        }

        else return str+str+str;
    }

}
