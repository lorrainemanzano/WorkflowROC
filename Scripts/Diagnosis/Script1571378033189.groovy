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

WebUI.navigateToUrl('https://qa.medisource.com/patientcare/9B1E9547-DAF3-40F4-820E-C5881066FBCA/C8456552-AA09-4EBF-B4EC-9A3EB6FBF25B/2019/oasis/diagnosis/roc/B8A507ED-973F-4CB5-82DB-48318F1127A4/9B1E9547-DAF3-40F4-820E-C5881066FBCA')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1021'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1021'), 'Diabetes mellitus due to underlying condition with hyperosmolarity without nonketotic hyperglycemic-hyperosmolar coma (NKHHC)')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1021_column2'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1021_column2'), 'E08.00')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1021_checkbox'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/OASIS ROC/Diagnosis/Diagnosis_M1023B'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1023B'), 'Heart failure, unspecified')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1023B_column2'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1023B_column2'), 'I50.9')

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1028_2'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1030_1'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1033_1'))

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1060_height'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1060_height'), '45')

WebUI.delay(2)

WebUI.click(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1060_weight'))

WebUI.delay(2)

WebUI.setText(findTestObject('OASIS ROC/Diagnosis/Diagnosis_M1060_weight'), '175')

