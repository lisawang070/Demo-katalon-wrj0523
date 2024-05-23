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

WebUI.click(findTestObject('Object Repository/daxueLogin/Page__/div__z-1 absolute top-0 right-0 w-64px h-64_f837c7'))

WebUI.click(findTestObject('Object Repository/daxueLogin/Page__/div_'))

WebUI.setText(findTestObject('Object Repository/daxueLogin/Page__/input__ant-input css-1gfrjrs ant-input-outl_3b6196'), 
    'interfaceTest33')

WebUI.setEncryptedText(findTestObject('Object Repository/daxueLogin/Page__/input__ant-input css-1gfrjrs ant-input-outl_59806d'), 
    '5WbaaGOlRjI=')

WebUI.click(findTestObject('Object Repository/daxueLogin/Page__/input__ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/daxueLogin/Page__/div__1'))

WebUI.click(findTestObject('Object Repository/daxueLogin/Page__/span_25'))

WebUI.closeBrowser()

