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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


WebUI.openBrowser(site_url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_My Store/a_Sign in'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), correct_email)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr._id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'name')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'surname')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), '8SQVv/p9jVScEs4/2CZsLw==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '2003', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/div_Your addressFirst name Last name Compan_df68a1'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'street 6')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'city')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/p_State --AlabamaAlaskaArizonaArkansasCalif_c49684'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '17', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '12345')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '111222333')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_My account - My Store/h1_My account'), 'MY ACCOUNT')

WebUI.closeBrowser()
