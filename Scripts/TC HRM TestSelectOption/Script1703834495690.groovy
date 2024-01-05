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

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/a_PIM'))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/1_EmployementStatus_div_-- Select --'))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/2_EmploymentStatus_div_Freelance', [('employmentStatus') : employmentStatus]))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/3_Include_div_Current Employees Only'))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/4_Include_div_Current and Past Employees', [('include') : include]))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/5_JobTitle_div_-- Select --'))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/6_JobTitleAccount_div_Account Assistant', [('jobtitle') : jobtitle]))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/7_SubUnit_div_-- Select --'))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/8_SubUnite_Orange_div_OrangeHRM', [('subUnit') : subUnit]))

WebUI.click(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/9_button_Search'))

WebUI.verifyElementPresent(findTestObject('OrangeHRM Exercise1/Page_OrangeHRM/10_Meesage_div_InfoNo Records Found'), 0)

