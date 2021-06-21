/**
 * ****************************************************************************
 * Purpose: This class analyzes the mood using Custom Exception.  
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 21-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.MoodAnalyzer;

public class MoodAnalyzer {

	private String message;

	public MoodAnalyzer(String message) {
		this.message = message;
	}
/**
 * This method is used to analyze the mood
 * @return SAD if message contains sad 
 * @return HAPPY if message contains any mood
 */
	public String analyseMood() {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";

	}
}
