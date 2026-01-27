package Excel_testing;

import java.io.IOException;

import org.testng.annotations.Test;

import Excel_test.Excel_T1;

public class Reader_excel1 {
	Excel_T1 ex1 = new Excel_T1();
	
	@Test
	
	public void Read_Data() throws IOException{
		String res = ex1.Read_Data(0,2);
		System.out.println(res);
		
	}

}
