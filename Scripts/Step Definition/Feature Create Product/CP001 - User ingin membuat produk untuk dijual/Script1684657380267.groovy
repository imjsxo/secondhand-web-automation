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

WebUI.callTestCase(findTestCase('Step Definition/Feature Login/LG001 - User ingin login dengan kredensial yang benar'), 
    [('closeBrowser') : false], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Feature Create Product/btn_Jual'))

WebUI.setText(findTestObject('Feature Create Product/cp_product_name'), 'Mobil Mazda')

WebUI.setText(findTestObject('Feature Create Product/cp_product_price'), '200000000')

WebUI.selectOptionByValue(findTestObject('Feature Create Product/cp_product_category'), '2', true)

WebUI.setText(findTestObject('Feature Create Product/cp_product_description'), 'New')

'Upload test-photo.png to input_browse'
WebUI.uploadFile(findTestObject('Feature Create Product/cp_product_img'), '"C:\\Users\\User\\Downloads\\mazda-6-black-c5f2.png"')

WebUI.click(findTestObject('Feature Create Product/cp_btn_terbitkan'))

WebUI.closeBrowser()

