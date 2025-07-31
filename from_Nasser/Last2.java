import java.util.HashMap;

public class Last2 {

    public static int last2(String str) {

        if (str.length()<2){return 0;}
    int count=0;
        String er=str.substring(str.length()-2);
for(int i=0;i<str.length()-2;i++){
    if(str.substring(i,i+2).contains(er)){
        count++;
    }
        }

return count;
    }

    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
    }



}
