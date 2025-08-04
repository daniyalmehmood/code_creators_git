public class AbbaPatternGenerator {
    public static String createAbbaPattern(String first, String second) {
        return first + second + second + first;
    }

    public static void main(String[] args) {
        System.out.println(createAbbaPattern("Hi", "Bye"));     // Output: HiByeByeHi
        System.out.println(createAbbaPattern("Yo", "Alice"));   // Output: YoAliceAliceYo
        System.out.println(createAbbaPattern("What", "Up"));    // Output: WhatUpUpWhat
    }
}
