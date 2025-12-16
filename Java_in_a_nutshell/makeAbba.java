package Java_in_a_nutshell;

public class makeAbba {
	
	public static String makeAbba(String a, String b) {
        return a + b + b + a;
    }
	
	
	
	
	
	public static void main(String[] args) {
        // Test cases
        System.out.println(makeAbba("Hi", "Bye"));     // HiByeByeHi
        System.out.println(makeAbba("Yo", "Alice"));   // YoAliceAliceYo
        System.out.println(makeAbba("What", "Up"));    // WhatUpUpWhat
    }
}
