/**
 * ****************************************************************************
 * Purpose: This class contains the JUnit test cases to analyze the mood whether
 * 			the mood is sad or happy  
 *
 * @author Syeda Naziya
 * @version 1.0
 * @since 21-06-2021
 * ****************************************************************************
 */

package com.bridgelabz.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest {

	/*
	 * This Test Case accepts Sad Mood
	 */
	@Test
	public void givenMessage_WhenSad_ShouldReturn_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
		try {
			String mood = moodAnalyzer.analyseMood();

			Assert.assertEquals("SAD", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	/*
	 * This Test Case accepts any Mood
	 */
	@Test
	public void givenMessage_WhenNotSad_ShouldReturn_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
		try {
			String mood = moodAnalyzer.analyseMood();
			Assert.assertEquals("HAPPY", mood);
		} catch (MoodAnalysisException e) {
		}
	}

	/*
	 * This Test Case Will Check For Null Pointer Exception for null
	 * 
	 */
	@Test
	public void givenNullMood_ShouldThrow_Exception() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer(null);
		try {
			moodAnalyzer.analyseMood(null);
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_NULL, e.type);
		}
	}

	/*
	 * This Test Case Will Check For Null Pointer Exception for Empty mood.
	 */
	@Test
	public void givenEmptyMood_ShouldThrow_Exception() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("");
		try {
			moodAnalyzer.analyseMood("");
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.exceptionType.ENTERED_EMPTY, e.type);
		}
	}
}