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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(url)

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/a_Make Appointment'))

WebUI.setText(findTestObject('Manual HealthC/Page_CURA Healthcare Service/input_Username_username'), username)

WebUI.setEncryptedText(findTestObject('Manual HealthC/Page_CURA Healthcare Service/input_Password_password'), password)

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/button_Login'))

WebUI.selectOptionByValue(findTestObject('Manual HealthC/Page_CURA Healthcare Service/select_Facilities'), Facilities, false)

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/label_Apply for hospital readmission'))

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/input_Medicaid_programs', [('program') : programs]))

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/input_Visit Date (Required)_visit_date'))

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/td_31'))

WebUI.setText(findTestObject('Manual HealthC/Page_CURA Healthcare Service/textarea_Comment_comment'), comment)

WebUI.click(findTestObject('Manual HealthC/Page_CURA Healthcare Service/button_Book Appointment'))

WebUI.verifyElementPresent(findTestObject('Manual HealthC/Page_CURA Healthcare Service/div_AppointmentConfirmation'), 0)

WebUI.closeBrowser()

