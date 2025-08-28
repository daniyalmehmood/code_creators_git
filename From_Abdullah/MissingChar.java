public class MissingChar {
    public String removeCharAtIndex(String str, int n) {
        String finalword = "";

        //for (int i = 0 ; i < str.length (); i++ ) {
        //if (i != n)
        //finalword += str.charAt(i);
        //}
        //return finalword;
//}


//another Solution::
        return str.substring (0,n) + str.substring (n+1);
    }
}
