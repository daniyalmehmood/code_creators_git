public class TripletRanger {
    public String shiftFirstInTriplets(String str) {
        String newWord ="";
        for(int i=0 ; i<str.length()-2;i+=3){
            newWord = newWord + str.substring(i+1,i+3)+ str.charAt(i);}
        return newWord;
    }

}
