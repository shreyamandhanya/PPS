package rbac;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Exceldata 
	{
		HSSFWorkbook workbook;
		HSSFSheet sheet;
		String fileName;
			
		public Exceldata(String fileName) throws IOException{
		File src= new File(fileName);
		FileInputStream inputStream = new FileInputStream(src);
		workbook= new HSSFWorkbook(inputStream);
	}
		public String getData(int SheetIndex, int row, int Column)
		{
		HSSFCell cell= workbook.getSheetAt(SheetIndex).getRow(row).getCell(Column);
		String data= "";
		
	if(cell== null) {
	 data= "";	
	}
	else {
		data = cell.getStringCellValue().trim();
	}
			 return data;
	}
			
		public int getRowCount(int SheetIndex) {
			int row= workbook.getSheetAt(SheetIndex).getLastRowNum();
			return (row);
			}
		
		public int getLastCellValue(int SheetIndex, int RowNum) {
			int ColumnNum= workbook.getSheetAt(SheetIndex).getRow(RowNum).getPhysicalNumberOfCells();
			return ColumnNum;
			
		}
	}


