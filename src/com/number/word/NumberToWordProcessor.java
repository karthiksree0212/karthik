package com.number.word;

import com.number.word.util.*;

public class NumberToWordProcessor

{
	public String convert(int number) {

		if (number == 0) {
			System.out.println("Input is 0 ");
			return "zero";
		}

		String prefix = "";

		if (number < 0) {
			System.out.println("Prefix -ve Sign, if the number is less than 0");
			number = -number;
			prefix = "negative";
		}

		String current = "";
		int place = 0;

		do {
			int n = number % 1000;
			System.out.println("Splitting based on mutiples of 1000" );
			if (n != 0) {
				String s = convertLessThanOneThousand(n);
				
				current = s + NumberToWordUtil.specialNames[place] + current;
				System.out.println("Current Word as per iteration"+current);
			}
			place++;
			number /= 1000;
		} while (number > 0);

		return (prefix + current).trim();
	}

	private String convertLessThanOneThousand(int number) {
		String current;

		if (number % 100 < 20) {
			System.out.println("Handling Numbers from 11 to 19");
			current = NumberToWordUtil.numNames[number % 100];
			number /= 100;
		} else {
			current = NumberToWordUtil.numNames[number % 10];
			number /= 10;
			current = NumberToWordUtil.tensNames[number % 10] + current;
			number /= 10;
		}
		if (number == 0)
			return current;
		return NumberToWordUtil.numNames[number] + " hundred" + current;
	}

}