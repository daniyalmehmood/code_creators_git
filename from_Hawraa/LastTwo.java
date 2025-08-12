public class LastTwo {
    public static int lastTwo(String str) {
        if(str.length() < 2){
            return 0;
        }
        int count = 0;
        String lastCh = str.substring(str.length() - 2);

        for (int i = 0; i < str.length()-2; i++){
            String chars = str.substring(i, i+2);
            if(chars.equals(lastCh)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(lastTwo("hixxhi"));
        System.out.println(lastTwo("xaxxaxaxx") );
        System.out.println(lastTwo("axxxaaxx"));
    }
}
