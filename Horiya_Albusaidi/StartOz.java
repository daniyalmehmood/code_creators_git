public class StartOz {
    public static String startOz(String str) {
        boolean checkIfFirstChatIsO=str.charAt(0)=='o';
        boolean checkIfSecondChatIsZ=str.charAt(1)=='z';
        if (checkIfFirstChatIsO && checkIfSecondChatIsZ)
        {
            return "oz";
        }
        else if (checkIfFirstChatIsO)
        {
           return "o";
        }
        else if (checkIfSecondChatIsZ)
        {
            return "z";
        }
        else return "There is no (o,z) in the word";

    }
}
