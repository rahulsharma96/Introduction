package Excel;

import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteData {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
	
		File f = new File("../Revision/FileOutput.xls");
		WritableWorkbook wk =Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Rahul",0);
		for(int i=0;i<3;i++)                        //for row
		{
			for(int j=0;j<3;j++)                   //for column
			{
				Label l = new Label(j,i,"Rahul");  //cell_structure
				ws.addCell(l);
				
			}
		}
		wk.write();
		wk.close();
		
	}

}
