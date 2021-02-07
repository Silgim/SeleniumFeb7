package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GenericMethod {
	public static String[][] getData(String fileName,String sheetName) throws IOException{
		File file = new File(fileName);
		FileInputStream ips = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(ips);
		
		Sheet sh = wb.getSheet(sheetName);
		int rowNumber = sh.getLastRowNum()+1;
		int colNumber = sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowNumber][colNumber];
		
		for(int i = 0;i<rowNumber;i++) {
			Row row = sh.getRow(i);
			for(int j=0;j<colNumber;j++) {
				Cell cell = row.getCell(j);
				String value = new DataFormatter().formatCellValue(cell);
				data[i][j] = value;
				
			}
		}
		wb.close();
		return data;
	}
	/*
	 public void writeData(String outputFile, String sheetName, int rowNumber, int columnNumber, String dataToWrite) throws Exception {
		// create file input stream object for the excel sheet
		FileInputStream fis = new FileInputStream(outputFile);
		// create object for work book
		Workbook wb = WorkbookFactory.create(fis);
		//create object for sheet present in excel using Workbook object 'wb'
		Sheet sheet = wb.getSheet(sheetName);
		//create object for row present in sheet using Sheet object 'sheet'
		Row row = sheet.getRow(rowNumber);
		//create object for cell present in row using Row object 'row'
		Cell cell = row.createCell(columnNumber);
		cell.setCellValue(dataToWrite);
		FileOutputStream fos = new FileOutputStream(outputFile);
		wb.write(fos);
		
	}
	 */
}
