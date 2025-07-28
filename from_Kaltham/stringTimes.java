public class Warmup_2 {

public String stringTimes(String str, int n) {
        StringBuilder str2=new StringBuilder();
        for(int i=0; i<n; i++){
            str2.append(str);
        }
        return str2.toString();
    }
}
