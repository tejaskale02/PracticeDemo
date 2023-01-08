package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		 FileInputStream file=new FileInputStream("D:\\Test Acadamy\\Selenium\\Parameterization.xlsx");
		String data= WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getStringCellValue();
        System.out.println(data);
	}

}