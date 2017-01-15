package com.practice.geek.category.string;

import static org.junit.Assert.*;

import org.junit.Test;

public class CheckPalindromeTest {
	
	@Test
	public void testAllRandumString() {
		CheckPalindrome palindrome = new CheckPalindrome();
		assertFalse(palindrome.isPalindrome("sdskdjskjdksjdksjdkjskd"));
	}
	
	@Test
	public void testIfOddStringAndMirrorimageFromMidValue(){
		CheckPalindrome palindrome = new CheckPalindrome();
		assertTrue(palindrome.isPalindrome("abcdedcba"));
	}
	
	@Test
	public void testIfEvenStringAndMirrorImageFromMidValue(){
		CheckPalindrome palindrome = new CheckPalindrome();
		assertTrue(palindrome.isPalindrome("abcddcba"));
	}

}
