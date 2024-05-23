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

WebUI.navigateToUrl('https://login.koolearn.com/sso/toLogin.do?next_page=https%3A%2F%2Fstudy.koolearn.com%2Fmy')

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page__/div__z-1 absolute top-0 right-0 w-64px h-64_f837c7'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page__/div_'))

WebUI.setText(findTestObject('Object Repository/调试新录播功能/Page__/input__ant-input css-1gfrjrs ant-input-outl_3b6196'), '18500527318')

WebUI.setEncryptedText(findTestObject('Object Repository/调试新录播功能/Page__/input__ant-input css-1gfrjrs ant-input-outl_59806d'), 
    '3GlNCRTV0+mWOfJnED2PyA==')

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page__/input__ant-checkbox-input'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page__/div__1'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_-/a_Alice'))

WebUI.switchToWindowTitle('【内部测试勿动勿用】Alice内部测试考研混合类周任务试图 - 新东方在线网络课堂')

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_Alice -/p_Alice001'))

WebUI.switchToWindowTitle('【内部测试勿动勿用】Alice内部测试考研混合类周任务试图-新东方在线网络课堂')

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_Alice-/span_19'))

WebUI.switchToWindowTitle('19. 总导学课（加语音规则） - 新东方在线网络课堂')

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_19.  -/div__dx-player-controller-progress-dot'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_19.  -/div__dx-player-controller-progress-dot'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_19.  -/dx-popover_2.0X1.8X1.5X1.2X1.0X0.8X'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_19.  -/dx-popover_2.0X1.8X1.5X1.2X1.0X0.8X'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_19.  -/div_1.8X'))

WebUI.click(findTestObject('Object Repository/调试新录播功能/Page_19.  -/div__dx-player-controller-progress-dot'))

WebUI.closeBrowser()

