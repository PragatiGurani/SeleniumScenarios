
package com.examples;

import java.util.Arrays;
import java.util.Iterator;

public class BasicPrograms {
	public static void main(String[] args) {

//		String s1 = "MOMyu";//string palidrome
//		String s2 = "";
//		for (int i = s1.length()-1; i >=0 ; i--) {
//			s2 = s2 + s1.charAt(i);
//		}
//
//		System.out.println(s2);
//====================================================================================
		String s1 = "listei";
		String s2 = "sileit";
		String s3 = "";
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {
				if (c1[i] == c2[j]) {
					s3 = s3 + c1[i];
					break;
				}
			}
		}
		System.out.println(s3);
		System.out.println(s1);
		if (s1.equals(s3)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
//=============================================================================
//		int num = 1213; //string palindrome
//		int rem = 0;
//		int rev = 0;
//		int temp = num;
//		while (num > 0) {
//
//			rem = num % 10;// 1
//			rev = (rev * 10) + rem;// 1
//			num = num / 10;// 12
//
//		}
//		System.out.println(rev);
//		System.out.println(temp);
//=============================================================================
//		int n1 = 0; //fibonanci
//		int n2 = 1;
//		int n3;
//		int num = 5;
//		System.out.println(n1);
//		System.out.println(n2);
//		while (num>=  3) {
//			n3 = n1 + n2;
//			System.out.println(n3);
//			n1 = n2;
//			n2 = n3;
//			num--;
//========================================================================
//		int num = 7;//prime
//		int count = 0;
//
//		for (int i = 1; i <= num; i++) {
//			if (num % i == 0) {
//				count = count + 1;
//			}
//		}
//
//		if (count == 2) {
//			System.out.println("prime");
//		} else {
//		System.out.println("not prime");
//		}
//========================================================================
//		for (int i = 1; i < s.length() - 1; i++) {
//			char c = s.charAt(0);
//			if (c==s.charAt(i)) {
//				System.out.println(s.charAt(i));
//				char ch =s.charAt(i);
//               System.out.println(s.indexOf(ch));
//			}
//		}
//=======================================================================================
//		String s =  "missicippi";  //display pos of first duplicate index
//		int f;
//		char[] c = s.toCharArray();
//		for (int i = 0; i < s.length(); i++) {
//			f = 1;
//			for (int j = i + 1; j < s.length(); j++) {
//				if (c[i] == c[j]) {
//					f++;
//				}
//			}
//			if (f > 1) {
//				System.out.println(c[i]+" occurs "+f);
//			}
//		}
//===============================================================================		
//		int[] a = { 10, 30, 50, 20 };  //second largest num
//		int temp;
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		int alength = a.length;
//		for (int i = 0; i < a.length; i++) {
//			System.out.print(a[i]);
//		}
//		System.out.println(a[alength - 2]);
// ===============================================================================

//		int[] arr = { 14, 9, 3, 2, 43, 11, 58, 22 };
//		System.out.println("Before Insertion Sort");
//		for (int i : arr) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//
//		int n = arr.length;
//		for (int j = 1; j < n; j++) {
//			int key = arr[j];
//			int i = j - 1;
//			while ((i > -1) && (arr[i] > key)) {
//				arr[i + 1] = arr[i];   //
//				i--;
//			}
//			arr[i + 1] = key;
//
//			System.out.println("After Insertion Sort");
//			for (int a : arr) {
//				System.out.print(a + " ");
//			}
//		}
//=====================================================================================
//		String s = "missipihj"; // remove duplicate char in string
//		String temp = s;
//		char[] c = s.toCharArray();
//		for (int i = 0; i < s.length(); i++) {
//			for (int j = i + 1; j < s.length(); j++) {
//				if (c[i] == c[j]) {
//					c[j] = ' ';
//				}
//			}
//		}
//		String st = new String(c);
//		System.out.println(st);
//		st = st.replace(" ", "");
//		System.out.println(st);
//
	}

}
