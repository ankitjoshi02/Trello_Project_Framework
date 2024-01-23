package com.qsp.trello.genericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
/**
 * this method is used to read the string data fom  excel sheet
 * @param sheetName
 * @param rowIndex
 * @param cellIndex
 * @return String
 * @throws EncryptedDocumentException
 * @throws IOException
 */
	public String readTheStringData(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/tst/resources");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		String cellValue = cell.getStringCellValue();
		return cellValue;
	}
	/**
	 * this method is used to read the string data fom  excel sheet
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @return Double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	
	public double readTheDoubleData(String sheetName, int rowIndex, int cellIndex)
			throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("./src/tst/resources");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowIndex);
		Cell cell = row.getCell(cellIndex);
		double cellValue =cell.getNumericCellValue();
		return cellValue;
	}
	
	

}
