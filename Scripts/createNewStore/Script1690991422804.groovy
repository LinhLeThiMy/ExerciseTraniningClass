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


//def store_name = 'Transcy-ltm1'
def email = 'linhltm@fireapps.vn'
def password = 'Shopify@2020'//hiện tại dùng mã encrypt shopify không nhận diện được text-> báo sai pass

WebUI.openBrowser("https://partners.shopify.com/1662018/stores/new?store_type=test_store")

WebUI.maximizeWindow()

//Login shopify
	WebUI.setText(findTestObject('Object Repository/Page_LogInShopify/input_email'),email )
	
	WebUI.click(findTestObject('Object Repository/Page_LogInShopify/btn_ContinueWithEmail'))
	
	//WebUI.delay(30) -- để trường hợp dính capcha
	
	WebUI.setText(findTestObject('Object Repository/Page_LogInShopify/input_password'),password)
	
	WebUI.click(findTestObject('Object Repository/Page_LogInShopify/btn_login'))

WebUI.setText(findTestObject('Object Repository/Page_CreateNewStore/input_storeName'), store_name)

WebUI.click(findTestObject('Object Repository/Page_CreateNewStore/btn_createNewStore'))


