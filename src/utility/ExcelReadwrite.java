package utility;

import java.io.File;


import java.io.FileInputStream;
import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadwrite {	
	static XSSFWorkbook wB;
	static XSSFSheet wS;
	static XSSFCell xC;
	//static String pathToExcel = "C:\\Users\\tanus\\eclipse-workspace\\Data_DrivenFramework\\Indigo Test Cases.xlsx";

	/*
	 * static { 	
	 * 
	 * if(wB==null) { setExcel(Constantvalues.path); }
	 * 
	 * }
	 */
	
//	public static String show() {
//		System.out.println("loads first..");
//		return "first value";
//	}
	public static void  setExcel(String pathname) {
		System.out.println("creating workbook...");
		try {
		File f = new File(pathname);
		FileInputStream fis = new FileInputStream(f);
		wB= new XSSFWorkbook(fis);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception handled...");
			e.getMessage();
		}
	}

	public static String readValue(String sheetname,int rownumber,int columnnumber)  {
		wS=wB.getSheet(sheetname);
		xC=wS.getRow(rownumber).getCell(columnnumber);
		DataFormatter df = new DataFormatter();
		String celldata = df.formatCellValue(xC);
		
		return celldata;
	}

	public static void  writevalue(String sheetname,int rownumber,int colnumber,String value) throws Exception{
		wS=wB.getSheet(sheetname);
		xC=wS.getRow(rownumber).getCell(colnumber);
		xC.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(Constantvalues.excelPath);
		wB.write(fos);
		fos.close();

		File f = new File(Constantvalues.excelPath);
		FileInputStream fis = new FileInputStream(f);
		wB= new XSSFWorkbook(fis);

	}

	/*
	 * public static void main(String[] args) throws Exception {
	 * setExcel(Constantvalues.filepath);
	 * System.out.println(readValue(Constantvalues.sheetname, 10, 3));
	 * System.out.println(readValue(Constantvalues.sheetname, 15, 3));
	 * System.out.println(readValue(Constantvalues.sheetname, 5, 4));
	 * 
	 * writevalue(Constantvalues.sheetname, 10, 4, "Pass");
	 * writevalue(Constantvalues.sheetname, 11, 4, "Pass"); }
	 */
}           
