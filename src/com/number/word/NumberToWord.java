package com.number.word;

import com.number.word.exception.NumberInvalidException;

public interface NumberToWord {

	String numberToWordConverter(int number) throws NumberInvalidException;

}
