public class MoveXToEnd {

    // Recursive function to move all 'x' to the end of the string
    public String moveXToEnd(String str) {
        
        if (str.length() == 0) {
            return "";
        }

        char firstChar = str.charAt(0);

        // Recursive call for the rest of the string
        String rest = moveXToEnd(str.substring(1));

        // If first char is 'x', put it at the end
        if (firstChar == 'x') {
            return rest + firstChar;
        } 
        // Otherwise, keep it in the front
        else {
            return firstChar + rest;
        }
    }

    
    public static void main(String[] args) {
        MoveXToEnd mover = new MoveXToEnd();

        System.out.println(mover.moveXToEnd("xxre"));     
        System.out.println(mover.moveXToEnd("xxhixx"));   
        System.out.println(mover.moveXToEnd("xhixhix"));  
    }
}