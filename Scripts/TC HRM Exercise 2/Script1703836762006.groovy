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

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/a_Leave'))

WebUI.sendKeys(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/1_input_From Date_oxd-input oxd-input--focus'), Keys.chord(
        Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/1_input_From Date_oxd-input oxd-input--focus'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/1_input_From Date_oxd-input oxd-input--focus'), fromDate)

WebUI.sendKeys(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/2_input_To Date_oxd-input oxd-input--focus'), Keys.chord(
        Keys.CONTROL, 'A'))

WebUI.sendKeys(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/2_input_To Date_oxd-input oxd-input--focus'), Keys.chord(
        Keys.BACK_SPACE))

WebUI.setText(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/2_input_To Date_oxd-input oxd-input--focus'), toDate)

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/3_ShowLeave_div_Select'))

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/4_div_Rejected', [('showLeave') : showLeave]))

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/5_LeaveType_div_-- Select --'))

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/6_LeaveType_div_CAN - FMLA', [('leaveType') : leaveType]))

WebUI.setText(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/7_EmployeeName_input'), employeeInput)

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/8_div_Alice  Duval', [('employeeInput') : employeeInput]))

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/9_SubUnit_div_-- Select --'))

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/10_SubUnit_div_Administration', [('subUnit') : subUnit]))

WebUI.click(findTestObject('OrangeHRM Exercise2/Page_OrangeHRM/11_button_Search'))

