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

'user open browser web lunapos.app'
WebUI.openBrowser('lunapos.app')

'user clicks button Daftar'
WebUI.click(findTestObject('Sign Up/btn-daftar'))

'user insert nama depan'
WebUI.setText(findTestObject('Sign Up/field-nama-depan'), 'Dinda ')

'user insert nama belakang '
WebUI.setText(findTestObject('Sign Up/field-nama-belakang'), 'Kanya Dewi')

'user insert username '
WebUI.setText(findTestObject('Sign Up/field-username'), 'indadimanasaja')

'user insert email'
WebUI.setText(findTestObject('Sign Up/field-email'), 'age@getnadace.com')

'user insert No. Hp '
WebUI.setText(findTestObject('Sign Up/field-no-hp'), '021021021')

'user insert password'
WebUI.setEncryptedText(findTestObject('Sign Up/field-password'), 'aeHFOx8jV/A=')

'user insert an invalid konfirmasi password '
WebUI.setEncryptedText(findTestObject('Sign Up/field-konfirmasi-password'), 'X8/+aF4geWQ=')

'click daftar'
WebUI.click(findTestObject('Sign Up/btn-daftar-page-regist'))

WebUI.verifyElementVisible(findTestObject('Sign Up/Error Message/Harap periksa kembali formulir di bawah untuk kesalahan'))

