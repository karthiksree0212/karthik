package com.number.word.exception;

public class NumberInvalidException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String errMsg;

	public NumberInvalidException(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrMsg() {
		return errMsg;
	}

}