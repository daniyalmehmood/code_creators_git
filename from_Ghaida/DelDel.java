public class DelDel {
    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));    // "abc"
        System.out.println(delDel("adelHello")); // "aHello"
        System.out.println(delDel("adedbc"));    // "adedbc"
    }
    
    public static String delDel(String str) {
        // Check if the string is short to contain "del" starting at index 1
        if (str.length() < 4) {
            return str; // return it unchanged
        }
        
        else if (str.substring(1, 4).equals("del")) {
            return str.charAt(0) + str.substring(4); // Remove "del"
        }
        else {
            return str; // return the string unchanged
        }
    }
}
