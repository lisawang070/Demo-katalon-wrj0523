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

WebUI.navigateToUrl('https://d.roombox.xdf.cn/vodplayer/?cid=518475981&mainId=518475981&token=eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiIxNjM1MjA1MyIsImV4cCI6MTcxMzQ0MDcyOSwiaWF0IjoxNzEzMzU0MzI5fQ.Ej1kEQPd84J2ZuKwvz5FmpN08QJrEMjUAShlN7e8cVopmreUiiqaP5qVTJ9X8161T9UeUttPL4WyKufoulHScg&bizCode=11049764&organizationId=10002&url=playback')

WebUI.click(findTestObject('Object Repository/vodPlayer/case3-vodPlayer/Page_vodPlayer/div__xdf-player_component_7FAB9DC5-51C5-469_03d896'))

WebUI.mouseOver(findTestObject('Object Repository/vodPlayer/case3-vodPlayer/Page_vodPlayer/div__xdf-player_component_7FAB9DC5-51C5-469_03d896'))

//WebUI.click(findTestObject('Object Repository/MyTestObject'))
//WebUI.click(findTestObject('Object Repository/case3-vodplayer/Page_vodplayer/div__xdf-player_component_C6746D4F-ACDD-42BD-AA34-BE21E6043506'))
WebUI.click(findTestObject('Object Repository/vodPlayer/case3-vodPlayer/Page_vodPlayer/span_1.5X'))

WebUI.click(findTestObject('Object Repository/vodPlayer/case3-vodPlayer/Page_vodPlayer/div__xdf-player_component_7FAB9DC5-51C5-469_03d896'))

WebUI.click(findTestObject('Object Repository/vodPlayer/case3-vodPlayer/Page_vodPlayer/div__xdf-player_component_7FAB9DC5-51C5-469_03d896'))

WebUI.closeBrowser()

