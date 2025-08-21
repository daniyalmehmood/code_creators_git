public class CountYZ {

    public int countWordsEndingWithYZ(String str) {

        str=str.toLowerCase();
        int count=0;
        for (int i=0; i<str.length();i++){


            if (str.charAt(i)== 'y' || str.charAt(i)=='z') {

                if (i==str.length()-1) count++;
                else if (!Character.isLetter(str.charAt(i+1))) count++;
            }
        }
        return count;
    }
}
