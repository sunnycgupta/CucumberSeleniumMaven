import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public ArrayList<String> getData(String testCaseName) throws Exception{
		ArrayList<String> al=new ArrayList<String>();
		FileInputStream fis=new FileInputStream("C://Users//sunny.gupta//eclipse-workspace//CucumberSeleniumMaven//datademo.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		int num=workbook.getNumberOfSheets();
		System.out.println("Number is "+num);
		for(int i=0;i<num;i++) {
			if(workbook.getSheetName(i).equalsIgnoreCase(testCaseName)) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
				Iterator<Cell> cells= firstrow.cellIterator();
				int k = 0,column=0;
				while(cells.hasNext())
				{
					Cell firstCell=cells.next();
					String value=firstCell.getStringCellValue();
					if(value.equalsIgnoreCase("testcase")) {
						column=k;
					}
					k++;
				}
				
			while(rows.hasNext()) {
				
				Row rowsCount=rows.next();
				if(rowsCount.getCell(column).getStringCellValue().equalsIgnoreCase("post")) {
					Iterator<Cell> cellCount=rowsCount.iterator();
					while(cellCount.hasNext()) {
						Cell cellValue=cellCount.next();
						if(cellValue.getCellTypeEnum()==CellType.STRING) {
						al.add(cellValue.getStringCellValue());
						}
						else {
							al.add(NumberToTextConverter.toText(cellValue.getNumericCellValue()));
						}
					}
				}
			}
			
			}
		}
		
		workbook.close();
		fis.close();
		return al;
	}
	
}
