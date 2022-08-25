
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class BaseClass {



    @DataProvider(name = "student")
    public Object[][] dataSupplier() throws IOException {
        Map<String, Integer> student = new HashMap<String, Integer>();
        System.out.println("Before class is executed");

        System.out.println(System.getProperty("user.dir") + "\\Excel\\Book2.xlsx");

        File file = new File(System.getProperty("user.dir") + "\\Excel\\Book2.xlsx");

        FileInputStream fis = new FileInputStream(file);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        int rowCount = sheet.getLastRowNum() - sheet.getFirstRowNum();
        int cellCount = sheet.getRow(1).getLastCellNum();
        Object[][] object = new Object[rowCount][1];


        for (int j = 1; j <= rowCount; j++) {

            String key = sheet.getRow(j).getCell(0).getStringCellValue();
            int value = (int) sheet.getRow(j).getCell(1).getNumericCellValue();
            student.put(key, value);
           object[j-1][0] = student;
        }
       // object[1][1]=student;

        for (Map.Entry<String, Integer> map1 : student.entrySet()) {
            System.out.println(map1.getKey() + " : " + map1.getValue());
        }
        return object;
    }
}

