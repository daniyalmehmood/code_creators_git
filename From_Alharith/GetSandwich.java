public class GetSandwich {

    public String getFillingBetweenBread(String str) {


        int firstBread = str.indexOf("bread");
        int lastBread = str.lastIndexOf("bread");

        if (firstBread != -1 && lastBread != -1 && firstBread != lastBread) {
            return str.substring(firstBread + 5, lastBread);
        }
        return "";
    }

}
