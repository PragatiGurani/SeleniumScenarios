package com.selenium;

import java.util.Scanner;

public class SpellingCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence");
		String sentenceInConsole = sc.nextLine();
		String[] console = sentenceInConsole.split(" ");
		
		System.out.println("**********************************");

		String s1 = "hi hello";
		String[] a = s1.split(" ");

		for (int i = 0; i < a.length; i++) {
			if ((a[i]).equals(console[i])) {
				System.out.println(a[i]+" correct");
			} else {
				System.out.println(console[i]+" not correct");
			}
		}
	}
}
