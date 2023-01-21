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

WebUI.openBrowser('lunapos.app')

WebUI.setText(findTestObject('Sign In/field-alamat-email'), 'wonderlandcafejkt@gmail.com')

WebUI.setEncryptedText(findTestObject('Sign In/field-kata-sandi'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Sign In/btn-login'))

WebUI.click(findTestObject('Dasbor/widget/close banner iklan'))

WebUI.click(findTestObject('Dasbor/widget/btn_widget'))

WebUI.click(findTestObject('Dasbor/widget/low stok'))

WebUI.click(findTestObject('Dasbor/widget/sales'))

WebUI.click(findTestObject('Dasbor/widget/avg sales per bill'))

WebUI.click(findTestObject('Dasbor/widget/avg sales per pax'))

WebUI.click(findTestObject('Dasbor/widget/gross margin'))

WebUI.click(findTestObject('Dasbor/widget/gross profit'))

WebUI.click(findTestObject('Dasbor/widget/gross sales'))

WebUI.click(findTestObject('Dasbor/widget/net sales'))

WebUI.click(findTestObject('Dasbor/widget/total bill'))

WebUI.click(findTestObject('Dasbor/widget/total pax'))

WebUI.click(findTestObject('Dasbor/widget/top category by amount'))

WebUI.click(findTestObject('Dasbor/widget/top category product by qty'))

WebUI.click(findTestObject('Dasbor/widget/top customer'))

WebUI.click(findTestObject('Dasbor/widget/top outlet'))

WebUI.click(findTestObject('Dasbor/widget/top product by amount'))

WebUI.click(findTestObject('Dasbor/widget/top product by qty'))

