public class StringOne {
    public String helloName(String name) {
        return "Hello " + name + "!";
    }

    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + "/" + tag + ">";
    }

    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2);
    }

    public String extraEnd(String str) {
        String end = str.substring(str.length() - 2);
        return end + end + end;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) {
            return str;
        }
        return str.substring(0, 2);
    }

    public String firstHalf(String str) {
        int halfStringIndex = str.length() / 2;
        return str.substring(0, halfStringIndex);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        } else return a + b + a;

    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

    public String theEnd(String str, boolean front) {
        if (front) return str.substring(0, 1);
        return str.substring(str.length() - 1);
    }

    public String withouEnd2(String str) {
        if (str.length() > 2) return str.substring(1, str.length() - 1);
        return "";
    }

    public String middleTwo(String str) {
        int middleIndex = str.length() / 2 - 1;
        return str.substring(middleIndex, middleIndex + 2);
    }

    public boolean endsLy(String str) {
        if (str.length() >= 2)
            return str.endsWith("ly");
        return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if (index + 2 <= str.length() && index > 0) return str.substring(index, index + 2);
        return str.substring(0, 2);

    }

    public String middleThree(String str) {
        int middleIndex = str.length() / 2;
        return str.substring(middleIndex - 1, middleIndex + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() > 3 && (str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad")))
            return true;
        else if (str.length() == 3 && (str.substring(0, 3).equals("bad")))
            return true;
        return false;
    }

    public String atFirst(String str) {
        if (str.isEmpty())
            return "@@";
        else if (str.length() < 2)
            return str + "@";
        return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        String newString = "";
        if (a.isEmpty() && !b.isEmpty())
            return "@" + b.charAt(b.length() - 1);
        else if (!a.isEmpty() && b.isEmpty())
            return a.charAt(0) + "@";
        else if (a.isEmpty() && b.isEmpty()) return "@" + "@";
        return a.substring(0, 1) + b.charAt(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.isEmpty() || b.isEmpty())
            return a + b;
        else if (a.charAt(a.length() - 1) == (b.charAt(0)))
            return a + b.substring(1);

        return a + b;
    }

    public String lastTwo(String str) {
        if (str.length() < 2)
            return str;
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);
    }

    public String seeColor(String str) {
        if (str.startsWith("red"))
            return str.substring(0, 3);
        else if (str.startsWith("blue")) return str.substring(0, 4);
        return "";

    }

    public boolean frontAgain(String str) {
        if (str.length() == 2) return true;
        else if (str.length() < 2) return false;
        return (str.substring(0, 2).equals(str.substring(str.length() - 2)));
    }

    public String minCat(String a, String b) {
        int aLength = a.length();
        int bLength = b.length();
        if (aLength > bLength)
            return a.substring(a.length() - bLength) + b;
        else return a + b.substring(b.length() - aLength);
    }

    public String extraFront(String str) {
        String front;
        if (str.length() > 1)
            front = str.substring(0, 2);

        else front = str;
        return front + front + front;
    }
    public String without2(String str) {
        if(str.length()<2){
            return str;
        }
        String start=str.substring(0,2);
        String end=str.substring(str.length()-2);
        if(start.equals(end))
            return str.substring(2);
        return str;

    }
    public String deFront(String str) {
        String newString;
        StringBuilder strBuilder=new StringBuilder();
        if(!str.isEmpty() &&str.charAt(0)=='a')
            strBuilder.append(str.charAt(0));
        if (str.charAt(1)=='b')
            strBuilder.append(str.charAt(1));
        strBuilder.append(str.substring(2));
        return strBuilder.toString();
    }
    public String startWord(String str, String word) {
        if(word.isEmpty())
            return "";
        String matchTheWord;
        if (str.length()>=word.length()){
            matchTheWord=str.substring(1,word.length());
            if(matchTheWord.equals(word.substring(1)))
                return str.substring(0,word.length());}
        return "";
    }
    public String withoutX(String str) {
        if(str.length()<2) return "";
        StringBuilder newString=new StringBuilder();
        if(!str.startsWith("x"))
            newString.append(str.charAt(0));
        if(!str.endsWith("x")) newString.append(str.substring(1));
        else newString.append(str, 1, str.length()-1);
        return newString.toString();
    }
    public String withoutX2(String str) {
       if(str.length()<2) return "";
       String newString="";
       boolean first=false;
       if(str.startsWith("x")) {
           str = str.substring(1);
           first=true;
       }
       if (first&&str.charAt(0)=='x')
           str = str.substring(1);
       else if (str.charAt(1)=='x') str = str.charAt(0)+str.substring(2);
       return str;
    }







}
