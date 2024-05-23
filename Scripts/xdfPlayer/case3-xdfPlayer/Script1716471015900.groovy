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

WebUI.click(findTestObject('vodPlayer/case1-fromMyliveTovodPlayer/Page_login/div__QRcode'))

WebUI.click(findTestObject('vodPlayer/case1-fromMyliveTovodPlayer/Page_login/div_'))

WebUI.setText(findTestObject('vodPlayer/case1-fromMyliveTovodPlayer/Page_login/input__loginusername'), username4)

WebUI.setText(findTestObject('vodPlayer/case1-fromMyliveTovodPlayer/Page_login/input__loginpassword'), password4)

WebUI.click(findTestObject('vodPlayer/case1-fromMyliveTovodPlayer/Page_login/input__ant-checkbox-input'))

WebUI.click(findTestObject('vodPlayer/case1-fromMyliveTovodPlayer/Page_login/div__loginbutton'))

WebUI.delay(2)

WebUI.navigateToUrl('https://study.koolearn.com/ky/learning/169323/18661681/19543406')

WebUI.delay(3)

WebUI.click(findTestObject('xdfPlayer/case3-xdfPlayer/Page_newPlayer/div__dx-player-play-btn'))

WebUI.closeBrowser()

