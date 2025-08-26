public class SeriesUp {

    public int[] formSeriesUpArray(int n) {

        int lenArray= n*(n + 1)/2;
        int[] result = new int[lenArray];
        int index=0;

        for (int i=0; i<n; i++){
            for (int j=0; j<i+1 ; j++){

                result[index++]=j+1;
            }
        }
        return result;
    }

}
