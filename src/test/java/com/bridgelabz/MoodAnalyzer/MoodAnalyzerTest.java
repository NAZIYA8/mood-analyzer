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

public class MoodAnalyzerTest {

	@Test
	public void givenMessage_WhenSad_ShouldReturn_Sad() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in Sad mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("SAD", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldRetuen_Happy() {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in any mood");
		String mood = moodAnalyzer.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}
}