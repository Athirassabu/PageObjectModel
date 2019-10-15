package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 40;
	public static long IMPLICIT_WAIT =40;
	public static Object[][] readExcelData(String sheeetName) throws IOException {

		XSSFWorkbook wbook = new XSSFWorkbook("C:\\Users\\User\\Germany\\FreeCRMTest1\\src\\main\\java\\com\\crm\\qa\\testdata\\GERMANY.xlsx");
		XSSFSheet sheet = wbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		System.out.println(lastRowNum);
		XSSFRow HeaderRow = sheet.getRow(0);
		int lastCellNum = HeaderRow.getLastCellNum();
		System.out.println(lastCellNum);	
		String[][] data =  new String[lastRowNum][lastCellNum];
		for (int i = 1; i <=lastRowNum ; i++) {
			
			XSSFRow row = sheet.getRow(i);
			for (int j = 0; j < lastCellNum; j++) {
				XSSFCell cell = row.getCell(j);
				String value = cell.getStringCellValue();
				System.out.println(value);
				data[i-1][j]=value;
			}
		}
		//wbook.close();
		return data;
		
	}

	public static void takeScreenshotAtEndOfTest() throws IOException {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
	}
	
}
