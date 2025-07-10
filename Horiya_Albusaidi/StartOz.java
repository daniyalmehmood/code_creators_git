public class StartOz {
    public static String startOz(String str) {
        if(!str.isEmpty()) {
            boolean checkIfFirstChatIsO = str.charAt(0) == 'o';
            boolean checkIfSecondChatIsZ =str.length()>1 && str.charAt(1) == 'z';
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

        else return "The word is empty";

    }
}
