public class SumLimit {
    public int sumLimit(int a, int b) {
        if(a+b >9){
            int sum=a+b;

            if (String.valueOf(sum).length() > String.valueOf(a).length()) return a;
        }
        else return a+b;
        return a+b;
    }


}
