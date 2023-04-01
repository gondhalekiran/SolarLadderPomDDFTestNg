package LibraryFiles;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{
public static String getPFData(String key) throws IOException //property file path
{
FileInputStream file=new FileInputStream("D:\\NewJAVA\\SolarLadderAssignment\\PropertyFile.properties");//property file path
			
Properties p =new Properties();
p.load(file);
			
String value = p.getProperty(key);
return value;
}
public static String getTD(int rowIndex,int colIndex) throws IOException 
{
FileInputStream file=new FileInputStream("D:\\NewJAVA\\SolarLadderTestAssignment\\TestData\\SolarLadderExcel.xls");
Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
String value = sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
return value;
}
}
