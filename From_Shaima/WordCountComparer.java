public class WordCountComparer {
    public static boolean hasEqualCatAndDogCount(String str) {
        int catCount=0; //initialize variable to count 'cat' in the string
        int dogCount=0; //initialize variable to count 'dog' in the string
        for (int i=0 ; i<=str.length()-3; i++){ // use for loop to go through the string
            if (str.substring(i,i+3).equals("cat")){ // check if the str contain 'cat'
                catCount++; // +1 while there is cat in the str
            }
            if (str.substring(i,i+3).equals("dog")){ // check if the str contain 'dog'
                dogCount++; // +1 while there is dog in the str
            }
        }
        if (catCount==dogCount){ // check if the number of cat is equal to number of dog
            return true; // they are equal
        }
        return false; // they are not equal to each other
    }
    public static void main(String[] args) {
        System.out.println(hasEqualCatAndDogCount("catdog"));
    }
}
