package liyana

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

public class KelasDua {

	@Keyword(keywordObject= 'Print C')
	public void printC(String wordC) {

		if (wordC != "faris") {
			//condition
			println "Automation Tester"    //arahan
		}
		//else if(wordC != "liyana") {
		//	println "Manual tester"
		//}

		else {
			println "Others"
		}

	}

	@Keyword(keywordObject= 'Print D')
	def printD(int nomborMasuk) {

		switch (nomborMasuk) {
			case 1:
				println "Yes"
				break
			case 2:
				println "No"
				break
			case 3 .. 6: // range number
				println "Nothing"
				break
			default:
				println "Empty"
				break
		}

	}

	@Keyword(keywordObject= 'Print E')
	public void printE(String wordMasuk, int step) {

		for(int nombor = 1; nombor <= step; nombor++ ) {
			println wordMasuk

		}
	}

	@Keyword(keywordObject= 'Print F')
	def printF() {
		List<String> multipleWords = new ArrayList<>() //Container /bekas
		multipleWords.add("faris1")
		multipleWords.add("faris2")
		multipleWords.add("faris3")

		//grooovy
		for (singleWord in multipleWords) {
			println singleWord
		}

		//java
		for(String singleword2 : multipleWords) {
			println singleword2
		}
	}

	@Keyword(keywordObject= 'Print G')
	def printG() {
		def names = ["Alice", "Bob", "Charlie", "David"]

		for (name in names) { // groovy
			println name
		}

		int[] numbers = [1, 2, 3, 4, 5]
		for(int number : numbers) {
			println number

		}
	}


}
