public class StartOz {
    public static String startOz(String str) {
        if(!str.isEmpty()) {
            boolean checkIfFirstCharIsO = str.charAt(0) == 'o';
            boolean checkIfSecondCharIsZ =str.length()>1 && str.charAt(1) == 'z';
            if (checkIfFirstCharIsO && checkIfSecondCharIsZ)
            {
                return "oz";
            }
            else if (checkIfFirstCharIsO)
            {
                return "o";
            }
            else if (checkIfSecondCharIsZ)
            {
                return "z";
            }
            else return "There is no (o,z) in the word";
        }

        else return "The word is empty";

    }
}
