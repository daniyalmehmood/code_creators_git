public class StringYak{
public String stringYak(String str) {

        StringBuilder str1 = new StringBuilder(str);
        for (int i = 0; i < str1.length()-2 ;) {
            if(str1.charAt(i)=='y'&&str1.charAt(i+1)=='a'&&str1.charAt(i+2)=='k'){
                str1.delete(i,i+3);
            }
            else{
                i++;
            }
        }
        return str1.toString();
    }
	}