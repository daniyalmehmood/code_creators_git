public class GetSandwich {
public String BreadsWordChecker(String str) {
        int lastIndexOfFirstBread = str.indexOf("bread") + 5;
        int FirstIndexOfSecondBread = str.lastIndexOf("bread");

        if (FirstIndexOfSecondBread > lastIndexOfFirstBread)
            return str.substring(lastIndexOfFirstBread, FirstIndexOfSecondBread);
        return "";
    }
	}