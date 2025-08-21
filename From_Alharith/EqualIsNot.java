public class EqualIsNot {

    public boolean hasEqualIsAndNot(String str) {

        int countIs=0;
        int countNot=0;

        for (int i=0; i<str.length();i++){

            if (i<str.length()-1 && str.substring(i,i+2).equals("is")) countIs++;
            else if (i<str.length()-2 && str.substring(i,i+3).equals("not")) countNot++;
        }
        return countIs==countNot;
    }

}
