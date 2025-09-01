public class SubstringBalanceChecker {
    public boolean hasEqualIsAndNot(String str) {
        int not =0;
        int is =0;
        for (int i = 0; i <str.length() ; i++) {
            if(i<str.length()-2) {
                String result =str.substring(i,i+3);
                if (result.equals("not"))
                    not++;
            }
            if (i<str.length()-1) {
                String result =str.substring(i,i+2);
                if (result.equals("is"))
                    is++;
            }

            }
            if (not==is) { return true;}
            else {
                      return false;
            }
            }


        }



