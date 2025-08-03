public class WordFramer {
    public static String insertIntoOut(String out, String word) {
        StringBuilder out1 = new StringBuilder() ; // Create a StringBuilder object to build 'out1' variable
        StringBuilder out2 = new StringBuilder() ; // Create a StringBuilder object to build 'out2' variable
        StringBuilder result = new StringBuilder() ; // Create a StringBuilder object to build 'result' variable
        if (out.length()==4){ // check the length of 'out' should be 4
            out1.append(out,0,2); // out1 takes the first 2 index from out
            out2.append(out,2,4); // out2 takes the last 2 index from out
        }
        return result.append(out1).append(word).append(out2).toString(); // return the value of 'result' after adding the value of out1, word and out2 and convert it to string
    }
    public static void main(String[] args) {
        System.out.println(insertIntoOut("<<>>", "Yay"));
        System.out.println(insertIntoOut("<<>>", "WooHoo"));
        System.out.println(insertIntoOut("[[]]", "word"));
    }
}
