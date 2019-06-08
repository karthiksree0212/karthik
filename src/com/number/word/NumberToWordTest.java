package com.number.word;

import java.util.Scanner;

import com.number.word.exception.NumberInvalidException;

public class NumberToWordTest {

	public static void main(String[] args) throws NumberInvalidException,Exception {
		System.out.println("Enter the Number for Converting: ");
		try {
			Scanner scn = new Scanner(System.in);
			int number = scn.nextInt();
			NumberToWord numberToWord = new NumberToWordImpl();

			String word = numberToWord.numberToWordConverter(number);

			System.out.println("**************And the word is **************");
			System.out.println(word);

		} catch (Exception e) {
			System.out.println("NumberInvalidException");
			throw new NumberInvalidException("NumberInvalidExceptionThrown");
		}
	}

}
