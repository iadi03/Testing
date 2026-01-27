package Excel_test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_T1 {


	public String Read_Data(int vRow, int vColumn )throws IOException {
		String value = null;
		Workbook wb = null;
		
		FileInputStream fls = new FileInputStream("./Excel_file/inventory.xlsx");
		
		wb = new XSSFWorkbook(fls);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(vRow );
		Cell cell = row.getCell(vColumn);
		value = cell.getStringCellValue();
		return value;

	}

}