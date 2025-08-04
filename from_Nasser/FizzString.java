public class FizzString {
    public String fizzString(String str) {

        if(str.startsWith("f") && !str.endsWith("b"))return "Fizz";
        else if (!str.startsWith("f")&& str.endsWith("b"))return "Buzz";
        else if (str.startsWith("f")&& str.endsWith("b")) return "FizzBuzz";
        else return str;



    }

}
