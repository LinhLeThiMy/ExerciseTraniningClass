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


def email = 'linhltm@fireapps.vn'
def password = 'Shopify@2020'//hiện tại dùng mã encrypt shopify không nhận diện được text-> báo sai pass

WebUI.openBrowser("https://www.shopify.com/partners")

WebUI.maximizeWindow()

WebUI.click(btn_homeLogin)

WebUI.setText(input_email, email)

WebUI.click(btn_continueWithEmail)

//WebUI.delay(30)--để trường hợp dính capcha

WebUI.setText(input_password, password)

WebUI.click(btn_login)

WebUI.click(findTestObject('Object Repository/Page_LogInShopify/select_partner'))
