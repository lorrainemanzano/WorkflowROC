import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.delay(10)

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/9B1E9547-DAF3-40F4-820E-C5881066FBCA/C8456552-AA09-4EBF-B4EC-9A3EB6FBF25B/2019/oasis/clinical/roc/B8A507ED-973F-4CB5-82DB-48318F1127A4/9B1E9547-DAF3-40F4-820E-C5881066FBCA')

WebUI.delay(10)

WebUI.click(findTestObject('OASIS ROC/visit_date'))

WebUI.setText(findTestObject('OASIS ROC/visit_date'), '10/14/2019')

WebUI.delay(3)

WebUI.click(findTestObject('OASIS ROC/time_in'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/time_in'), '0100')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS ROC/time_out'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/time_out'), '0200')

WebUI.delay(5)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0014'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0014_AK'))

WebUI.delay(5)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0080-2'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0090'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Clinical_Records/M0090'), '10/14/2019')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0102-na'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0104'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Clinical_Records/M0104'), '10/14/2019')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0110-1'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0140-1'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M0150-3'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Clinical_Records/M1000-1'))

