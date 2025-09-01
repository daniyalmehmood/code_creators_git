public class BlockAnalyzer {
    public int lengthOfLargestBlock(String str) {
      //  Loop through the string.
        int count =0 ;
        int tempcount =1 ;
        if(str.length()==0) return 0;
        for(i=0;i<str.length();i++){
            if(i<str.length()-1 && str.charAt(i)== str.charAt(i+1))
                tempcount++;
            else tempcount=1 ;
            if (tempcount >count) {
              count =  tempcount ;

            }
        }
        return count;
    }
}
