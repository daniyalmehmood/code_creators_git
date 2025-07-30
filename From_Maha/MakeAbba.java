public class MakeAbba {
    public static void main(String[] args) {
        MakeAbba obj = new MakeAbba();

        System.out.println(obj.makeAbba("Hi", "Bye"));    // "HiByeByeHi"
        System.out.println(obj.makeAbba("Yo", "Alice"));  // "YoAliceAliceYo"
        System.out.println(obj.makeAbba("What", "Up"));   // "WhatUpUpWhat"
    }

    

    public String makeAbba(String a, String b) {
        return a+b+b+a;
    }

}
