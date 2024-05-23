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

WebUI.navigateToUrl('https://daxue.koolearn.com/')

WebUI.click(findTestObject('Object Repository/Demo-searchtest/Page__/img__w-32px h-32px absolute top-0 right--48_3643d3'))

WebUI.setText(findTestObject('Object Repository/Demo-searchtest/Page__/input__keyword'), '在职考研')

WebUI.click(findTestObject('Object Repository/Demo-searchtest/Page__/button_'))

WebUI.switchToWindowTitle('新东方在线官网_新东方旗下远程教育网站,新东方网络课堂,新东方网校,新东方官方网校,新东方网络课程,新东方考研辅导班')

WebUI.click(findTestObject('Object Repository/Demo-searchtest/Page__,,,,,/div_2025'))

WebUI.closeBrowser()

