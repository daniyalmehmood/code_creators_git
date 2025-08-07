public class DivisibleByThreeOrFiveNotBoth {
    public static boolean divisibleByThreeOrFiveNotBoth(int number) {
        boolean divisibleByThree = number % 3 == 0;
        boolean divisibleByFive = number % 5 == 0;
        return (divisibleByThree || divisibleByFive) && number % 15 != 0;
    }

    public static void main(String[] args) {
        System.out.println(divisibleByThreeOrFiveNotBoth(3));
        System.out.println(divisibleByThreeOrFiveNotBoth(10));
        System.out.println(divisibleByThreeOrFiveNotBoth(15));
    }
}