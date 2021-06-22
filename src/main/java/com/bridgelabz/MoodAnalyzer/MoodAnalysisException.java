/**
 * ****************************************************************************
 * Purpose: This is a Mood Analysis Exception class that extends Exception.
 * 
 * @author Syeda Naziya
 * @version 1.0
 * @since 21-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.MoodAnalyzer;

public class MoodAnalysisException extends Exception {
	public exceptionType type;

	public MoodAnalysisException(exceptionType type, String message) {
		super(message);
		this.type = type;
	}

	public enum exceptionType {
		ENTERED_EMPTY, ENTERED_NULL
	}
}
