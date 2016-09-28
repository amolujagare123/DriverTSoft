package travel.utilities;

import com.relevantcodes.extentreports.ExtentReports;

/**
 * Created by tct4 on 8/12/2016.
 */
public class initExtentReport {
    static ExtentReports extent;
    public static ExtentReports init()
    {
        extent = new ExtentReports("E:\\selenium-projects-akshay\\DriverTSoft\\Extent-report",false/*, NetworkMode.OFFLINE*/);

   return extent;
    }
}
