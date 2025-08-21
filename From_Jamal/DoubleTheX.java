public class DoubleTheX {
    public boolean doubleX(String str) {


        int count=0;
        for (int i = 0; i  < str.length()-1; i ++){
            if(count>0)break;
            if(str.charAt(i) == 'x')count++;

            if (str.charAt(i) == 'x' && str.charAt(i+1)=='x'){

                return true;

            }
        }
        return false;
    }

}
