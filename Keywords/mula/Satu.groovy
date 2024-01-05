package mula

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import mula.Dua

//Class
public class Satu {

	@Keyword(keywordObject = 'Tulis Hello Worlds') //Describe keyword
	def print(String wordSatu, String wordDua) { //FUnction atau method and parameter

		//Groovy
		println wordSatu + " " + wordDua //Point of starting of a program

	}

	@Keyword(keywordObject= 'Apa2')
	public void printDua() {
		int numberOne = 1;


		println numberOne;

		Dua.printTiga()

		Dua dua = new Dua() // declare instance
		dua.printEmat()

	}
}
