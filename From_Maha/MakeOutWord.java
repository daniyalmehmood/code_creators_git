
    public class MakeOutWord {

        public String makeOutWord(String out, String word) {
            return out.substring(0, 2) + word + out.substring(2, 4);
        }

        public static void main(String[] args) {
            MakeOutWord obj = new MakeOutWord();

            System.out.println(obj.makeOutWord("<<>>", "Yay"));   //output <<Yay>>
            System.out.println(obj.makeOutWord("<<>>", "WooHoo")); // output <<WooHoo>>
            System.out.println(obj.makeOutWord("[[]]", "word"));   // output[[word]]
        }
    }

