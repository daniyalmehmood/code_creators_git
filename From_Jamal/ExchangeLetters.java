public class ExchangeLetters {



        public static String frontBack(String str) {


            if(str.length() <= 1 ) return str;{

            }

            String first = str.substring(0,1);
            String middle = str.substring(1,str.length()-1);
            String last = str.substring(str.length()-1);




            return last + middle + first ;





        }

    public static void main(String[] args) {
        System.out.println(frontBack("Jamal")); // The word will be inverted,end of the code !! ,
    }



    }



