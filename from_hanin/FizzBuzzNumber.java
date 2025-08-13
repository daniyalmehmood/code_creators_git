public class FizzBuzzNumber {
        public String getFizzBuzzString(int n) {
            if (n % 15 == 0) {
                return "FizzBuzz!";
            } else if (n % 3 == 0) {    // divisible by 3 only
                return "Fizz!";
            } else if (n % 5 == 0) {    // divisible by 5 only
                return "Buzz!";
            } else {
                return n + "!";
            }
        }
    }


