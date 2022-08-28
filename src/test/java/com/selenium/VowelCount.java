package com.selenium;

import java.util.Scanner;

public class VowelCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Sentence in alphabets only"); //pragati
        String word =scanner.nextLine();
        word=word.toLowerCase();
        
        int vowelcount=0;
        int space=0;
        int consonent=0;
        
        for(int i=0;i<word.length();i++) { 
        	Character c =word.charAt(i);
        	if(Character.isDigit(word.charAt(i))) {
        		System.out.println("character Is number"+c);
        	}
        	else if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||
        			word.charAt(i)=='u') {
        		vowelcount++;
        	}else if(word.charAt(i)==' '){
        		space++;
        	} else {
        		consonent++;
        	}
        }
        System.out.println("Number of vowels :"+vowelcount);
        System.out.println("Number of Consonents :"+consonent);
        System.out.println("Number of Space :"+space);
	}
}
