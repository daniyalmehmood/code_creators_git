public class StringExpander  {

    public String addFirstTwoCharsAround(String str) {
        int take =2;


        if (str.length()<take){
            take = str.length();

        }
        String front = str.substring(0,take);
        return front +str+front;
    }
}
