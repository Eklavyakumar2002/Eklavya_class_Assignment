package utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import base.BaseClass;

public class ScreenshotUtil extends BaseClass {
	public static void capture(String name) throws Exception {
		String timestamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());

		File src = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshots/" + name + timestamp + ".png");

		FileUtils.copyFile(src, dest);
	}
}