package com.example.javamavenjunithelloworld;

import static org.junit.Assert.assertTrue;


import java.io.IOException;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/**
 * *Author : Sampath K V
 * Unit test for to match a text from a response saved to a file.
 * <p/>
 */
public class Assessment
{
	/**
	 * *Author : Sampath K V
	 * Before All Method will Call the Data file creation Method
	 * Which creates with random pages, lines and words.
	 * <p/>
	 */
	@BeforeAll
	void setup()
	{
		try {
			//This Method creates with random pages, lines and words.
			TestData.createFileData();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	/**
	 * *Author : Sampath K V
	 * This Test will  find a straight matching text from a response saved to a file
	 * Which creates with random pages, lines and words.
	 * <p/>
	 */
@Test
void straightmatch()
{
	boolean status=false;
	try {
		status=TextSearch.searchString("Test File Finance", "Finance");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertTrue(status);
}

/**
 * *Author : Sampath K V
 * This Test will  find a straight matching text from a response saved to a file
 * Which creates with random pages, lines and words.
 * <p/>
 */
@Test
void matchWithRegex()
{
	boolean status=false;
	try {
		status=TextSearch.searchStringregex("Test File Finance", "Fina");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertTrue(status);
}

@Test
void MatchWord()
{
	boolean status=false;
	try {
		status=TextSearch.searchString("Test File Finance", "S a m p l e C o m p a n y");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	assertTrue(status);
}
}
