public class SumNumbers {

    public int sumAllNumbersInString(String str) {
        int sum=0;
        StringBuilder newString= new StringBuilder();
        for (int i=0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))){
                newString.append(str.charAt(i));
                if(str.length()-1==i){
                    sum+=Integer.parseInt(newString.toString());
                }
            }
            else if(newString.length()>0){
                sum+=Integer.parseInt(newString.toString());
                newString=newString.delete(0,newString.length());
            }
        }


        return sum;
    }


}
