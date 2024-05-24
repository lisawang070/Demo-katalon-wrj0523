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

WebUI.navigateToUrl('https://login.koolearn.com/sso/toLogin.do?next_page=https%3A%2F%2Fstudy.koolearn.com%2Flive%2Findex')

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_login/div__QRcode'))

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_login/div_'))

WebUI.setText(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_login/input__loginusername'), username4)

WebUI.setText(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_login/input__loginpassword'), password4)

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_login/input__ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_login/div__loginbutton'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_mylive/input__p-search__input'), '巧记四六级核心词！')

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_mylive/i__clicksearchicon'))

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_mylive/a_clickpalybackbutton'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_vodplayer/div__xdf-player_pagebottom'))

not_run: WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_vodplayer/div_speed'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/vodPlayer/case1-fromMyliveTovodPlayer/Page_vodplayer/span_1.25X'))

WebUI.closeBrowser()

