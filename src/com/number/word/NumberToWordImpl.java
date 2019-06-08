package com.number.word;

import com.number.word.exception.NumberInvalidException;

public class NumberToWordImpl implements NumberToWord {

	@Override
	public String numberToWordConverter(int number) throws NumberInvalidException {
		String method_name = "numberToWordConverter";
		NumberToWordProcessor processor = new NumberToWordProcessor();
		System.out.println(method_name + " Coverting Number to Word Start and number is " + number);
		
		String word = processor.convert(number);
		System.out.println(method_name + " Coverting Number to Word End and the word is " + word);
		
		return word;
	}

}
