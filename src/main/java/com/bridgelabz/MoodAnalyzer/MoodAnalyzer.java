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

	/**
	 * This method is used to analyze mood.
	 * 
	 * @return SAD if message contains sad.
	 * @return HAPPY if message contains happy.
	 */
	public String analyseMood(String message) {
		if (message.contains("Sad"))
			return "SAD";
		else
			return "HAPPY";

	}
	
	
}