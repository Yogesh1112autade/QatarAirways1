package TestCases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	public WebDriver driver;
	
	public void Launch() throws IOException {
		String email;
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.qatarairways.com/en-in/homepage.html?CID=SXIN23456993M&account=Google"
				+ "-SEA_SASC-IN-EN-Brand&campaign=IN-Brand-Hero-EN_exact&adgroup=qatar+airways&term=qatar+airways"
				+ "&&&&&gad_source=1&gclid=Cj0KCQjwpP63BhDYARIsAOQkATZTWfHCNDZ4pNiSxPFcoyCl7bVJ9whO6"
				+ "0ycYY-AprH3nzwhihaRHQ8aAn4iEALw_wcB&gclsrc=aw.ds");
		

		try {
			FileInputStream fs=new FileInputStream("M:\\Selenium\\Setup\\textExcel\\QatarAirways.xlsx");
			XSSFWorkbook workbook=new XSSFWorkbook(fs);
			XSSFSheet objsheet=workbook.getSheet("SignUp");
			XSSFRow row=objsheet.getRow(1);
			email=row.getCell(0).getStringCellValue();
			//System.out.println("email:"+email);
} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	}	
		 public ArrayList<String> dataread(String filepath,String Sheetname,int cellno)
		   {
			   ArrayList<String> obja=new ArrayList<String>();
			   
			   try {
				   FileInputStream fs= new FileInputStream(filepath);
					XSSFWorkbook workbook=new XSSFWorkbook(fs);//open the workbook
					XSSFSheet objsheet=workbook.getSheet(Sheetname);//open the sheet
					XSSFRow row=objsheet.getRow(1);
					int n=row.getLastCellNum();
					//int rowcount=objsheet.get;
					
					for(int i=0;i<n;i++) {
						//XSSFRow row1=objsheet.getRow(1);
						String value=row.getCell(i).getStringCellValue();
						obja.add(value);
					}
					workbook.close();
					fs.close();
			   }
			   catch(Exception e) {
				   e.printStackTrace();
			   }
			   return obja;
		   }
			
		
	

}
