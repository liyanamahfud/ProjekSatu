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

WebUI.callTestCase(findTestCase('Orange HRM Training/TC1 HRM Login'), [('url') : 'https://opensource-demo.orangehrmlive.com/web/index.php/auth/login'
        , ('username') : 'Admin', ('password') : 'hUKwJTbofgPU9eVlw/CnDQ=='], FailureHandling.STOP_ON_FAILURE)

WebUI.maximizeWindow()

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/1_span_Admin'))

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/2_button_Add'))

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/3_div_-- Select --'))

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/4_div_Admin', [('selectUserRole') : selectUserRole]))

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/5_Status_div_-- Select --'))

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/6_div_Enabled', [('selectStatus') : selectStatus]))

WebUI.setText(findTestObject('TC HRM Add User/Page_OrangeHRM/7_input'), searchEmployeeName)

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/8_span_Jimmy  Carter', [('selectEmployeeName') : selectEmployeeName]))

WebUI.setText(findTestObject('TC HRM Add User/Page_OrangeHRM/9_input_Username_oxd-input oxd-input--focus oxd-input--error'), 
    username)

WebUI.setEncryptedText(findTestObject('TC HRM Add User/Page_OrangeHRM/10_input_Password_oxd-input oxd-input--focus'), password)

WebUI.setEncryptedText(findTestObject('TC HRM Add User/Page_OrangeHRM/11_input_Confirm Password_oxd-input oxd-input--focus'), 
    confirmPassword)

WebUI.click(findTestObject('TC HRM Add User/Page_OrangeHRM/12_button_Save'))

WebUI.verifyElementPresent(findTestObject('TC HRM Add User/Page_OrangeHRM/13_div_SuccessSuccessfully Saved'), 0)

