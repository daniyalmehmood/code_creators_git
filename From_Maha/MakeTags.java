
    public class MakeTags {

        public String makeTags(String tag, String word) {
            return "<" + tag + ">" + word + "</" + tag + ">";
        }

        public static void main(String[] args) {
            MakeTags obj = new MakeTags();

            System.out.println(obj.makeTags("i", "Yay"));       // <i>Yay</i>
            System.out.println(obj.makeTags("b", "Hello"));     // <b>Hello</b>
            System.out.println(obj.makeTags("em", "Wow"));      // <em>Wow</em>
        }
       }

