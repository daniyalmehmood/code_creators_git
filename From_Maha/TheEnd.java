ppublic class FirstOrLastChar {

    /**
     * Returns either the first or last character of the input string,
     * based on the value of the boolean parameter.
     */
    
    public String getEndCharacter(String str, boolean front) {
        if (front == true) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
}
