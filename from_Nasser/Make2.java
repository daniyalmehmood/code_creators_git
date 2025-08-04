public class Make2 {

    public int[] make2(int[] a, int[] b) {


        int[] fit=new int[2];
        if(a.length>=2){
            fit[0]=a[0];
            fit[1]=a[1];
            return fit;
        }
        else if(a.length==1){
            fit[0]=a[0];
            fit[1]=b[0];
            return fit;
        }
        else {
            fit[0]=b[0];
            fit[1]=b[1];
            return fit;

        }
    }

}
