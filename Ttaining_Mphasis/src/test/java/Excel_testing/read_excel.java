package Excel_testing;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class read_excel {


	   public static void main(String[] args) throws Exception {
	       File file = new File("./Excel_file/inventory.xlsx");
	       FileInputStream fis = new FileInputStream(file);
	       XSSFWorkbook workbook = new XSSFWorkbook(fis);
	       System.out.println("Workbook has " + workbook.getNumberOfSheets() + " sheets.");
	       workbook.close();
	       fis.close();
	   }
	}

