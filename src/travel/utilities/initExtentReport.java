package travel.utilities;

import com.relevantcodes.extentreports.ExtentReports;

/**
 * Created by tct4 on 8/12/2016.
 */
public class initExtentReport {
    static ExtentReports extent;
    public static ExtentReports init()
    {
        extent = new ExtentReports("D:\\PROJECT\\DriverTSoft\\Extent-report\\reports.html",false/*, NetworkMode.OFFLINE*/);

   return extent;
    }
}
