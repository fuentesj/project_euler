package com.fuentesj.euler;

public class Solution {

	public static void main(String[] args) {
		
		int currentMax = 0;
		int next = 0;
		
		for (int i = 100; i <= 999; i++) {
			for (int j = 100; j <= 999; j++) {
				next = i * j;
				if (isPalindrome(next) && next > currentMax) {
					currentMax = next;
				}
			}
		}
		System.out.println(currentMax);
	}
	
	private static boolean isPalindrome(Integer num) {
		StringBuilder numBuilder = new StringBuilder(num.toString());
		if (numBuilder.length() == 1) {
			return true;
		}
		else {
			int start = 0;
			int end = numBuilder.length() - 1;
			if (numBuilder.length() % 2 == 0) {
				while (!(start > end)) {
					if (!(Character.valueOf(numBuilder.charAt(start)).equals(Character.valueOf(numBuilder.charAt(end))))) {
						return false;
					}
					start++;
					end--;
				}
				return true;
			}
			else {
				while (!(start == end)) {
					if (!(Character.valueOf(numBuilder.charAt(start)).equals(Character.valueOf(numBuilder.charAt(end))))) {
						return false;
					}
					start++;
					end--;
				}
				return true;
			}
		}
	}
	
}
