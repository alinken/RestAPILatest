package utilities;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

import SetUp.BaseTest;

public class DataUtil extends BaseTest {

	@DataProvider(name = "data")
	public Object[][] getData(Method m) {

		System.out.println("Sheet Name " + m.getName());
		String sheetName = m.getName();
		int rows = excel.getRowCount(sheetName);
		int cols = excel.getColumnCount(sheetName);

		System.out.println("Total rows are: " + rows + " Total cols are : " + cols);

		Object[][] data = new Object[rows - 1][cols];

//		data[0][0] = excel.getCellData(sheetName,0,2);
//		data[0][1] = excel.getCellData(sheetName,1,2);
//		data[0][2] =  excel.getCellData(sheetName,2,2);
//		
//		data[1][0] = excel.getCellData(sheetName,0,3);
//		data[1][1] = excel.getCellData(sheetName,1,3);
//		data[1][2] =  excel.getCellData(sheetName,2,3);

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			for (int colsNum = 0; colsNum < cols; colsNum++) {

				data[rowNum - 2][colsNum] = excel.getCellData(sheetName, colsNum, rowNum);

			}

		}

		return data;

	}
}
