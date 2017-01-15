package com.practice.geek.category.string;

public class CheckPalindrome {

	public boolean isPalindrome(String input) {
		int length = input.length();
		if (length > 1) {
			int i = 0;
			int j = input.length() - 1;
			while (i < j) {
				if (input.charAt(i) != input.charAt(j)) {
					return false;
				}
				++i;
				--j;
			}
			return true;
		} else if (length == 1) {
			return true;
		}
		return false;
	}
}
