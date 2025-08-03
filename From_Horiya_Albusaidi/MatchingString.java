public class MatchingString {
    public int checkStringMatch(String a, String b) {
        int count=0;
        int shortStringlength;
        if(a.length() <2 || b.length()<2) return 0;
        if(a.length()> b.length()) shortStringlength=b.length();
        else shortStringlength=a.length();
        for(int i=0;i<shortStringlength-1;i++)
        {
            if(a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                count++;
        }
        return count;
    }

}
