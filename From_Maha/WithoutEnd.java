public class WithoutEnd {

    public String withoutEnd(String str) {
        if(str.length()>=2){
            return str.substring(1,str.length()-1);
        }
        else {
            return str;
        }
    }

    public static void main(String[] args) {
        WithoutEnd obj = new WithoutEnd();

        System.out.println(obj.withoutEnd("Hello"));   //output  "ell"
        System.out.println(obj.withoutEnd("java"));    // output "av"
        System.out.println(obj.withoutEnd("coding"));  //output  "odin"
    }

}