public class StringOne{
	public String helloName(String name) {
		return "Hello " + name + "!";
	}
	
	public String makeAbba(String a, String b) {
		return a + b + b + a;
	}
	
	public String makeTags(String tag, String word) {
		return "<" + tag + ">" + word + "</" + tag + ">";
	}
	
	public String makeOutWord(String out, String word) {
        String fOut = out.substring(0,2);
        String lOut = out.substring(2,4);
        return fOut + word + lOut;
    }
	
	public String extraEnd(String str) {
		String newStr = str.substring(str.length()-2);
		return newStr + newStr + newStr;
	}
	
	public String firstTwo(String str) {
		if(str.length() > 2){
            return str.substring(0, 2);
        }
        else {
            return str;
        }
	}
	
	public String firstHalf(String str) {
		String newStr = "";
		newStr = str.substring(0, str.length() / 2);
		return newStr;
	}
	
	public String withoutEnd(String str) {
		String newStr = "";
		newStr = str.substring(1, str.length() -1);
		return newStr;
	}
	
	public String comboString(String a, String b) {
		if (a.length() < b.length()){
            return a + b + a ;
        }
        else{
            return b + a + b;
        }
	}
	
	public String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}
	
	public String left2(String str) {
		String firstCh = "";
        String lastCh = "";
        if(str.length() > 2){
            firstCh = str.substring(0,2);
            lastCh = str.substring(2, str.length());
            return lastCh + firstCh;
        }
        else {
            return str;
        }
	}

	public String right2(String str) {
	String firstCh = "";
        String lastCh = "";
        if(str.length() > 2){
            firstCh = str.substring(str.length() - 2, str.length());
            lastCh = str.substring(0, str.length() - 2);
            return firstCh + lastCh;
        }
        else {
            return str;
        }
	}
	
	public String theEnd(String str, boolean front) {
		if(front == true){
            return str.substring(0, 1);
        }
        else{
            return str.substring(str.length() - 1);
        }
	}
	
	public String withouEnd2(String str) {
		if (str.length() > 1){
            return str.substring(1, str.length() - 1);
        }
        else {
            return str = "";
        }
	}
	
	public String middleTwo(String str) {
        int middle = str.length() / 2;
        return str.substring(middle - 1, middle + 1);
	}
	
	public boolean endsLy(String str) {
		if(str.length() >= 2) {
            String lastCh = str.substring(str.length() - 2);
            if (lastCh.equals("ly")) {
                return true;
            } else {
                return false;
            }
        }
        else{
            return false;
        }
	}
	
	public String nTwice(String str, int n) {
		String firstCha = str.substring(0, n);
		String lastCha = str.substring(str.length() - n);
		return firstCha + lastCha;
	}
	
	public String twoChar(String str, int index) {
		if(index < 0 || index > str.length() - 2){
            return str.substring(0, 2);
        }
        else {
            return str.substring(index, index + 2);
        }
	}
	
	public String middleThree(String str) {
		int middle = str.length() / 2;
		return str.substring(middle - 1, middle + 2);
	}

	public boolean hasBad(String str) {
		if (str.length() >= 3){
            if (str.substring(0, 3).equals("bad")) {
                return true;
            }
            else if (str.length() >= 4 && str.substring(1, 4).equals("bad")) {
                return true;
            }
        }
            return false;
	}

	public String atFirst(String str) {
		if(str.length() >= 2){
            return str.substring(0, 2);
        }
        else if (str.length() == 1) {
            return str + "@";
        }
        else{
            return "@" + "@";
        }
	}
	
	public String lastChars(String a, String b) {
		String firstChar;
		String lastChar;
		if (a.length() > 0) {
			firstChar = a.substring(0, 1);
		} 
		else {
			firstChar = "@";
		}
		if (b.length() > 0) {
			lastChar = b.substring(b.length() - 1);
		}
		else {
			lastChar = "@";
		}
		return firstChar + lastChar;
	}
	
	public String conCat(String a, String b) {
		if (a.isEmpty()){
            return b;
        }
        else if (b.isEmpty()){
            return a;
        }
        else if(a.charAt(a.length() - 1) == b.charAt(0)){
            return a + b.substring(1);
        }
        else{
           return a + b;
        }
	}
	
	public String lastTwo(String str) {
        if(str.length() < 2){
            return str;
        }
        char lastCh = str.charAt(str.length() - 2);
        char secCh = str.charAt(str.length() - 1);
        return str.substring(0, str.length() - 2) + secCh + lastCh;
    }
	
	public String seeColor(String str) {
        if(str.length() >= 4 && str.substring(0,4).equals("blue")){
            return "blue";
        }
        else if (str.length() >= 3 && str.substring(0,3).equals("red")) {
            return "red";
        }
        else{
            return "";
        }
    }
	
	public boolean frontAgain(String str) {
        if(str.length() >= 2){
            return str.substring(0,2).equals(str.substring(str.length()-2));
        }
        return false;
    }
	
	public String minCat(String a, String b) {
        if(a.length() > b.length()){
            a = a.substring(a.length() - b.length());
        }
        else if (a.length() < b.length()){
            b = b.substring(b.length() - a.length());
        }
        return a + b;
    }
	
	public String extraFront(String str) {
        if(str.length() >= 2){
            String newStr = str.substring(0,2);
            return newStr + newStr + newStr;
        }
        else {
            return str + str + str;
        }
    }
	
	public String without2(String str) {
        if (str.length() < 2) {
            return str;
        }
        String firstCh = str.substring(0, 2);
        String lastCh = str.substring(str.length() - 2);
        if (str.length() >= 2 && firstCh.equals(lastCh)) {
            return str.substring(2, str.length());
        }
        return str;
    }
	
	public String deFront(String str) {
        String newStr = "";
        if (str.length() >= 1) {
            if (str.charAt(0) == 'a') {
                newStr += 'a';
            }
        }

        if (str.length() >= 2) {
            if (str.charAt(1) == 'b') {
                newStr += 'b';
            }
        }

        if (str.length() > 2) {
            newStr += str.substring(2);
        }

        return newStr;
    }
	
	public String startWord(String str, String word) {
        if(str.length() < word.length()){
            return "";
        }
        String strFront = str.substring(1, word.length());
        String wordSub = word.substring(1);
        if(strFront.equals(wordSub)){
            return str.substring(0, word.length());
        }
        return "";
    }
	
	public String withoutX(String str) {
        int len = str.length();
        if (len == 0) {
            return "";
        }
        if (len > 0 && str.charAt(0) == 'x') {
            str = str.substring(1);
            len--;
        }
        if (len > 0 && str.charAt(len - 1) == 'x') {
            str = str.substring(0, len -1);
        }
        return str;
    }
	
	public static String withoutX2(String str) {
        String result = "";
        if (str.length() >= 1 && str.charAt(0) != 'x') {
            result += str.charAt(0);
        }
        if (str.length() >= 2 && str.charAt(1) != 'x') {
            result += str.charAt(1);
        }
        if (str.length() > 2) {
            result += str.substring(2);
        }
        return result;
    }
}