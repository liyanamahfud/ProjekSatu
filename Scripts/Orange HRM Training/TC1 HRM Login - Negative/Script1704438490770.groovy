import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

'Buka Google Chrome'
WebUI.openBrowser('')

'pergi ke website'
WebUI.navigateToUrl(url)

'masukkan username'
WebUI.setText(findTestObject('Object Repository/TC1 HRM/Page_OrangeHRM/input_Username_username'), username)

'masukkan password'
WebUI.setEncryptedText(findTestObject('Object Repository/TC1 HRM/Page_OrangeHRM/input_Password_password'), password)

'tekan butang login'
WebUI.click(findTestObject('Object Repository/TC1 HRM/Page_OrangeHRM/button_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('OrangeHRM Dashboard and Invalid Credentials/Page_OrangeHRM/p_Invalid credentials'), 0)

