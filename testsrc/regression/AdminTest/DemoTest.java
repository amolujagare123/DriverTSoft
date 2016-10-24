package regression.AdminTest;

import org.testng.annotations.Test;

//import travel.pages.Menu;


/**
 * Created by AKSHAY on 17/10/2016.
 */
public class DemoTest {

    @DataProvider(name = "DP1")
    public Object[][] createData1() throws Exception{
        Object[][] retObjArr=getTableArray("test\\Book1.xls",
                "DataPool", "testdata1");
        return(retObjArr);
    }

    @Test(dataProvider = "DP1")
    public void testDataProviderExample(String ex1,
                                        String ex2, String ex3, String ex4) throws Exception {
        ///Extensive coding here but for simplicity I will just print
        System.out.println(ex1);
        System.out.println(ex2);
        System.out.println(ex3);
        System.out.println(ex4);
    }

    @AfterClass
    public void tearDown(){
        selenium.close();
        selenium.stop();
    }

    public String[][] getTableArray(String xlFilePath, String sheetName, String tableName) throws Exception{
        String[][] tabArray=null;

        Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
        Sheet sheet = workbook.getSheet(sheetName);
        int startRow,startCol, endRow, endCol,ci,cj;
        Cell tableStart=sheet.findCell(tableName);
        startRow=tableStart.getRow();
        startCol=tableStart.getColumn();

        Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);

        endRow=tableEnd.getRow();
        endCol=tableEnd.getColumn();
        System.out.println("startRow="+startRow+", endRow="+endRow+", " +
                "startCol="+startCol+", endCol="+endCol);
        tabArray=new String[endRow-startRow-1][endCol-startCol-1];
        ci=0;

        for (int i=startRow+1;i<endRow;i++,ci++){
            cj=0;
            for (int j=startCol+1;j<endCol;j++,cj++){
                tabArray[ci][cj]=sheet.getCell(j,i).getContents();
            }
        }


        return(tabArray);
    }


}//end of class
