package Excel;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadData {

	public static void main(String[] args) throws BiffException,IOException {
	
		File f = new File("../Revision/FileInput.xls");
		Workbook wk = Workbook.getWorkbook(f);
		Sheet ws = wk.getSheet(0);
		int r = ws.getRows();
		int c = ws.getColumns();
		
		for(int i=0;i<r;i++)         //loop for row
		{
			for(int j=0;j<c;j++)     //loop for column
			{
				Cell c1 =ws.getCell(j,i);
				System.out.print(c1.getContents()+ " ");
			}
			System.out.println();
		}
		
	
		
	/*System.setProperty("webdriver.chrome.driver","C:\\Users\\RAHUL\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	System.out.println("browser invoked");*/
}
}