public class AbbaFormatter {

    public static void main(String[] args) {
        AbbaFormatter obj = new AbbaFormatter();

        System.out.println(obj.formatAbbaStyle("Hi", "Bye"));    // Output: HiByeByeHi
        System.out.println(obj.formatAbbaStyle("Yo", "Alice"));  // Output: YoAliceAliceYo
        System.out.println(obj.formatAbbaStyle("What", "Up"));   // Output: WhatUpUpWhat
    }

    // Returns a new string in the format: a + b + b + a.

    public String formatAbbaStyle(String a, String b) {
        return a + b + b + a;
    }
}
